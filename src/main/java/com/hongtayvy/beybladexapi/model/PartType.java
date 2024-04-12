package com.hongtayvy.beybladexapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PartType {
    BLADE("blade"),
    RATCHET("ratchet"),
    BIT("bit");

    private final String partType;
}
