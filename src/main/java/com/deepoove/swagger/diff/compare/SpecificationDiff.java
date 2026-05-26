package com.deepoove.swagger.diff.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.deepoove.swagger.diff.model.ChangedEndpoint;
import com.deepoove.swagger.diff.model.ChangedOperation;
import com.deepoove.swagger.diff.model.Endpoint;
import io.swagger.models.HttpMethod;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Response;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.properties.Property;

/**
 * compare two Swagger
 *
 * @author Sayi
 */
public class SpecificationDiff {

    private List<Endpoint> newEndpoints;

    private List<Endpoint> missingEndpoints;

    private List<ChangedEndpoint> changedEndpoints;

    private SpecificationDiff() {
    }

    public static SpecificationDiff diff(Swagger oldSpec, Swagger newSpec) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Property getResponseProperty(Operation operation) {
        Map<String, Response> responses = operation.getResponses();
        // temporary workaround for missing response messages
        if (responses == null)
            return null;
        Response response = responses.get("200");
        return null == response ? null : response.getSchema();
    }

    private static List<Endpoint> convert2EndpointList(Map<String, Path> map) {
        List<Endpoint> endpoints = new ArrayList<Endpoint>();
        if (null == map)
            return endpoints;
        map.forEach((url, path) -> {
            Map<HttpMethod, Operation> operationMap = path.getOperationMap();
            operationMap.forEach((httpMethod, operation) -> {
                Endpoint endpoint = new Endpoint();
                endpoint.setPathUrl(url);
                endpoint.setMethod(httpMethod);
                endpoint.setSummary(operation.getSummary());
                endpoint.setPath(path);
                endpoint.setOperation(operation);
                endpoints.add(endpoint);
            });
        });
        return endpoints;
    }

    private static Collection<? extends Endpoint> convert2EndpointList(String pathUrl, Map<HttpMethod, Operation> map) {
        List<Endpoint> endpoints = new ArrayList<Endpoint>();
        if (null == map)
            return endpoints;
        map.forEach((httpMethod, operation) -> {
            Endpoint endpoint = new Endpoint();
            endpoint.setPathUrl(pathUrl);
            endpoint.setMethod(httpMethod);
            endpoint.setSummary(operation.getSummary());
            endpoint.setOperation(operation);
            endpoints.add(endpoint);
        });
        return endpoints;
    }

    private static ListDiff<String> getMediaTypeDiff(List<String> oldTypes, List<String> newTypes) {
        return ListDiff.diff(oldTypes, newTypes, (t, sample) -> {
            for (String mediaType : t) {
                if (sample.equalsIgnoreCase(mediaType)) {
                    return mediaType;
                }
            }
            return null;
        });
    }

    public List<Endpoint> getNewEndpoints() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Endpoint> getMissingEndpoints() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ChangedEndpoint> getChangedEndpoints() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
