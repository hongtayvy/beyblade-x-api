package com.hongtayvy.beybladexapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Part {
    private String name;
    private String partType;
    private String brand;
    private String type;
    private String spin;
    private Integer attack;
    private Integer defense;
    private Integer stamina;
    private Integer endurance;
    private Integer dash;
    private Integer burstResistance;
    private double weight;
    private double height;
    private double width;
}
