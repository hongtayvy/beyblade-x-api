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
    private int attack;
    private int defense;
    private int stamina;
    private String spinDirection;
    private String releaseDate;
    private String compatibility;

}
