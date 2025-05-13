package com.wefit.forms.experiment.model.enums;

public enum PersonType {

    FISICA("Fisica"),
    JURIDICA("Juridica");

    private final String description;

    PersonType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
