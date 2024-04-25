package com.hongtayvy.beybladexapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BeybladeXExceptionEnum {
    PARAMETER_NOT_FOUND("Part type parameter not found"),
    DATABASE_NOT_FOUND("No parts found in database");

    private final String errorMessage;
}
