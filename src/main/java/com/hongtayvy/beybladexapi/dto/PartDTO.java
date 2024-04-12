package com.hongtayvy.beybladexapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class PartDTO {
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
