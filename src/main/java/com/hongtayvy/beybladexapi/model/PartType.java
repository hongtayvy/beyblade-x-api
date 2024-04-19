package com.hongtayvy.beybladexapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PartType {
    BLADE("Blade"),
    RATCHET("Ratchet"),
    BIT("Bit");

    private final String partType;
}
