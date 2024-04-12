package com.hongtayvy.beybladexapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "disc")
public class PartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "part_type")
    private String partType;
    @Column(name = "brand")
    private String brand;
    @Column(name = "type")
    private String type;
    @Column(name = "spin")
    private String spin;
    @Column(name = "attack")
    private int attack;
    @Column(name = "defense")
    private int defense;
    @Column(name = "stamina")
    private int stamina;
    @Column(name = "endurance")
    private int endurance;
    @Column(name = "dash")
    private int dash;
    @Column(name = "burst_resistance")
    private int burstResistance;
    @Column(name = "weight")
    private double weight;
    @Column(name = "height")
    private double height;
    @Column(name = "width")
    private double width;
}
