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
@Table(name = "coordonate_geografice")
@Getter
@Setter
public class Coordinates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_coordonat")
    private Long id;

    @Column(name = "latitudine")
    private Double latitude;

    @Column(name = "longitudine")
    private Double longitude;

    @Column(name = "altitudine")
    private Double altitude;

}
