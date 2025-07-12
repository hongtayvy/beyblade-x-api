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
    private String type;
    private String tipShape;
    private String material;
}
