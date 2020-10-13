package com.wolox.prueba.domain.business;

import lombok.Getter;

public enum BusinessCode {

    NOT_FOUND("NOT_FOUND", "Record not found"),
    NULL("NULL", "Element is null");


    @Getter
    private final String code;
    @Getter
    private final String description;

    private BusinessCode(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
