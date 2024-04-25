package com.hongtayvy.beybladexapi;

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
            default -> throw new IllegalStateException("Part type parameter not found");
        };
    }
}
