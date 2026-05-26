package com.deepoove.swagger.diff.model;

import java.util.Map;
import io.swagger.models.HttpMethod;
import io.swagger.models.Operation;

public class ChangedEndpoint implements Changed {

    private String pathUrl;

    private Map<HttpMethod, Operation> newOperations;

    private Map<HttpMethod, Operation> missingOperations;

    private Map<HttpMethod, ChangedOperation> changedOperations;

    public Map<HttpMethod, Operation> getNewOperations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNewOperations(Map<HttpMethod, Operation> newOperations) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<HttpMethod, Operation> getMissingOperations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissingOperations(Map<HttpMethod, Operation> missingOperations) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<HttpMethod, ChangedOperation> getChangedOperations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangedOperations(Map<HttpMethod, ChangedOperation> changedOperations) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPathUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPathUrl(String pathUrl) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiff() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
