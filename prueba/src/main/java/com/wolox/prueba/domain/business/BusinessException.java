package com.wolox.prueba.domain.business;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BusinessException extends RuntimeException{
    private final HttpStatus status;
    private final BusinessCode businessCode;

    public BusinessException(HttpStatus status, BusinessCode businessCode) {
        super(businessCode.getCode());
        this.status = status;
        this.businessCode = businessCode;
    }

    public BusinessException(HttpStatus status, BusinessCode businessCode, Exception ex) {
        super(businessCode.getCode(), ex);
        this.status = status;
        this.businessCode = businessCode;
    }

}
