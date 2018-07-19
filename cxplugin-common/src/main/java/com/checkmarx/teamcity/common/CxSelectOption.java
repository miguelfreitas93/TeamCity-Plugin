package com.checkmarx.teamcity.common;


/**
 * CxSelectOption is a simple structure used to populate a select box
 */

public class CxSelectOption {
    private String id;
    private String name;

    public CxSelectOption(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }
    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }
}