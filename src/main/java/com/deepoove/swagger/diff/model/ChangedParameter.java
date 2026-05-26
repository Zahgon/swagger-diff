package com.deepoove.swagger.diff.model;

import java.util.ArrayList;
import java.util.List;
import io.swagger.models.parameters.Parameter;

public class ChangedParameter implements Changed {

    private List<ElProperty> increased = new ArrayList<ElProperty>();

    private List<ElProperty> missing = new ArrayList<ElProperty>();

    private List<ElProperty> changed = new ArrayList<ElProperty>();

    private Parameter leftParameter;

    private Parameter rightParameter;

    private boolean isChangeRequired;

    // private boolean isChangeType;
    private boolean isChangeDescription;

    public boolean isChangeRequired() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangeRequired(boolean isChangeRequired) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isChangeDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangeDescription(boolean isChangeDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Parameter getLeftParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLeftParameter(Parameter leftParameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Parameter getRightParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRightParameter(Parameter rightParameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiff() {
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
