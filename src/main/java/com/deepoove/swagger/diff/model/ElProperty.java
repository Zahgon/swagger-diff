package com.deepoove.swagger.diff.model;

import io.swagger.models.properties.Property;

/**
 * property with expression Language grammar
 *
 * @author Sayi
 * @version
 */
public class ElProperty {

    private String el;

    private Property property;

    // optional change metadata
    private boolean isTypeChange;

    private boolean newEnums;

    private boolean removedEnums;

    public Property getProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setProperty(Property property) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEl(String el) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isTypeChange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTypeChange(boolean typeChange) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isNewEnums() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNewEnums(boolean newEnums) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isRemovedEnums() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRemovedEnums(boolean removedEnums) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
