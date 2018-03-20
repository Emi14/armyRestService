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
import java.util.Date;

/**
 * Created by ionutmihailescu on 12/26/17.
 */
@Entity
@Table(name = "vehicule")
@Getter
@Setter
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_armata")
    private Army army;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tip")
    private VehicleType type;

    @Column(name = "efectiv")
    private String condition;

    @Column(name = "denumire")
    private Date purchaseDate;

}
