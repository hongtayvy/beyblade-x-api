package com.hongtayvy.beybladexapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeybladeXErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}
