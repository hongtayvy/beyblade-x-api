package com.hongtayvy.beybladexapi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Beyblade {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String manufacturer;
    private String series;

    @OneToOne(cascade = CascadeType.ALL)
    private Blade blade;

    @OneToOne(cascade = CascadeType.ALL)
    private Ratchet ratchet;

    @OneToOne(cascade = CascadeType.ALL)
    private Bit bit;
}
