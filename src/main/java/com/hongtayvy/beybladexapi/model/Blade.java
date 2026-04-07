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
public class Blade {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String hasbroName;
    private String line;
    private String bladeType;
    private String collaboration;
    private Integer attack;
    private Integer defense;
    private Integer stamina;
    private String spinDirection;
    private String releaseDate;
    private String compatibility;
}
