package com.hongtayvy.beybladexapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class PartDTO {
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
