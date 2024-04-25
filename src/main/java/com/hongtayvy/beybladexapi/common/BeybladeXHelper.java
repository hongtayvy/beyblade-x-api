package com.hongtayvy.beybladexapi.common;

import com.hongtayvy.beybladexapi.exception.BeybladeXExceptionEnum;
import com.hongtayvy.beybladexapi.model.PartType;

import static com.hongtayvy.beybladexapi.model.PartType.BIT;
import static com.hongtayvy.beybladexapi.model.PartType.RATCHET;
import static com.hongtayvy.beybladexapi.model.PartType.BLADE;

public class BeybladeXHelper {
    public PartType parameterHelper(String partType){
        return switch(partType) {
            case "blade" -> BLADE;
            case "ratchet" -> RATCHET;
            case "bit" -> BIT;
            default -> throw new IllegalStateException(BeybladeXExceptionEnum.PARAMETER_NOT_FOUND.getErrorMessage());
        };
    }
}
