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
    private String hasbroName;
    private String partType;
    private String brand;
    private String type;
    private String spin;
    private String line;
    private String bladeType;
    private String collaboration;
    private String code;
    private String category;
    private Integer attack;
    private Integer defense;
    private Integer stamina;
    private Integer endurance;
    private Integer burst;
    private Integer dash;
    private Integer burstResistance;
    private Double weight;
    private Double height;
    private Double width;
}
