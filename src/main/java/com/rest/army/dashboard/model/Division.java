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
@Table(name = "divizie")
@Getter
@Setter
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cord_de_armata")
    private ArmyCorp armyCorp;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_maior")
    private Employee employee;

    @Column(name = "efectiv")
    private long numberOfEmployees;

    @Column(name = "denumire")
    private String name;

}
