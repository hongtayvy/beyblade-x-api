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
    private int attack;
    private int defense;
    private int stamina;
    private int endurance;
    private int dash;
    private int burstResistance;
    private double weight;
    private double height;
    private double width;
}
