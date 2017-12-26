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
@Table(name = "teatrul_de_operatiuni")
@Getter
@Setter
public class Battleground {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_teatru")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tara")
    private Country country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_maresal")
    private Employee employee;

    @Column(name = "numar_armate")
    private long armyCount;

    @Column(name = "denumire")
    private String name;

}
