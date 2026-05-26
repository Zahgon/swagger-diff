package com.deepoove.swagger.diff.model;

import java.util.ArrayList;
import java.util.List;
import io.swagger.models.parameters.Parameter;

public class ChangedOperation implements Changed {

    private String summary;

    private List<Parameter> addParameters = new ArrayList<Parameter>();

    private List<Parameter> missingParameters = new ArrayList<Parameter>();

    private List<ChangedParameter> changedParameter = new ArrayList<ChangedParameter>();

    private List<ElProperty> addProps = new ArrayList<ElProperty>();

    private List<ElProperty> missingProps = new ArrayList<ElProperty>();

    private List<ElProperty> changedProps = new ArrayList<ElProperty>();

    private List<String> addConsumes = new ArrayList<>();

    private List<String> missingConsumes = new ArrayList<>();

    private List<String> addProduces = new ArrayList<>();

    private List<String> missingProduces = new ArrayList<>();

    public List<Parameter> getAddParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAddParameters(List<Parameter> addParameters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Parameter> getMissingParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissingParameters(List<Parameter> missingParameters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ChangedParameter> getChangedParameter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangedParameter(List<ChangedParameter> changedParameter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ElProperty> getAddProps() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAddProps(List<ElProperty> addProps) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ElProperty> getMissingProps() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissingProps(List<ElProperty> missingProps) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ElProperty> getChangedProps() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangedProps(List<ElProperty> changedProps) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSummary() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSummary(String summary) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiff() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiffProp() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiffParam() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiffConsumes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDiffProduces() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getAddConsumes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAddConsumes(List<String> increased) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getMissingConsumes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissingConsumes(List<String> missing) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getAddProduces() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAddProduces(List<String> increased) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getMissingProduces() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMissingProduces(List<String> missing) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
