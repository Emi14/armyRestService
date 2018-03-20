package com.rest.army.dashboard.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by ionutmihailescu on 12/26/17.
 */
@Entity
@Table(name = "coordonatele_misiunii")
@Getter
@Setter
public class MissionCoordinates {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_misiune")
    private Mission mission;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_coordonat")
    private Coordinates coordinates;


}
