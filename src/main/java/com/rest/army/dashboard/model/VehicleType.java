package com.rest.army.dashboard.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ionutmihailescu on 12/26/17.
 */
@Entity
@Table(name = "tipuri_de_vehicule")
@Getter
@Setter
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "denumire")
    private String name;

    @Column(name = "descriere")
    private String description;

    @Column(name = "capacitate")
    private int capacity;

}
