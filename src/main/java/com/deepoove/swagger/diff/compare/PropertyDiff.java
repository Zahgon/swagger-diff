package com.deepoove.swagger.diff.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.deepoove.swagger.diff.model.ElProperty;
import io.swagger.models.Model;
import io.swagger.models.properties.Property;

public class PropertyDiff {

    private List<ElProperty> increased;

    private List<ElProperty> missing;

    private List<ElProperty> changed;

    Map<String, Model> oldDedinitions;

    Map<String, Model> newDedinitions;

    private PropertyDiff() {
        increased = new ArrayList<ElProperty>();
        missing = new ArrayList<ElProperty>();
        changed = new ArrayList<ElProperty>();
    }

    public static PropertyDiff buildWithDefinition(Map<String, Model> left, Map<String, Model> right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PropertyDiff diff(Property left, Property right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ElProperty> getIncreased() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIncreased(List<ElProperty> increased) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ElProperty> getMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissing(List<ElProperty> missing) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ElProperty> getChanged() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChanged(List<ElProperty> changed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
