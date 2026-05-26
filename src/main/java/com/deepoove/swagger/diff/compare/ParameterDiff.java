package com.deepoove.swagger.diff.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import com.deepoove.swagger.diff.model.ChangedParameter;
import com.deepoove.swagger.diff.model.ElProperty;
import com.google.common.collect.Lists;
import io.swagger.models.Model;
import io.swagger.models.parameters.AbstractSerializableParameter;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;

/**
 * compare two parameter
 *
 * @author Sayi
 * @version
 */
public class ParameterDiff {

    private List<Parameter> increased;

    private List<Parameter> missing;

    private List<ChangedParameter> changed;

    Map<String, Model> oldDedinitions;

    Map<String, Model> newDedinitions;

    private ParameterDiff() {
        this.increased = new ArrayList<Parameter>();
        this.missing = new ArrayList<Parameter>();
        this.changed = new ArrayList<ChangedParameter>();
    }

    public static ParameterDiff buildWithDefinition(Map<String, Model> left, Map<String, Model> right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ParameterDiff diff(List<Parameter> left, List<Parameter> right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Property mapToProperty(Parameter rightPara) {
        Property prop = new StringProperty();
        prop.setAccess(rightPara.getAccess());
        prop.setAllowEmptyValue(rightPara.getAllowEmptyValue());
        prop.setDescription(rightPara.getDescription());
        prop.setName(rightPara.getName());
        prop.setReadOnly(rightPara.isReadOnly());
        prop.setRequired(rightPara.getRequired());
        return prop;
    }

    public List<Parameter> getIncreased() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIncreased(List<Parameter> increased) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Parameter> getMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissing(List<Parameter> missing) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ChangedParameter> getChanged() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChanged(List<ChangedParameter> changed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
