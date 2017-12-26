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
@Table(name = "companie")
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_batalion")
    private Battalion battalion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_capitan")
    private Employee employee;

    @Column(name = "efectiv")
    private long numberOfEmployees;

    @Column(name = "denumire")
    private String name;

}
