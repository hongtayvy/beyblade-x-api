package com.hongtayvy.beybladexapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bit {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    private String category;
    private String line;
    private Double weight;
    private Integer attack;
    private Integer defense;
    private Integer stamina;
    private Integer burst;
    private Integer dash;
    private String type;
    private String tipShape;
    private String material;
}
