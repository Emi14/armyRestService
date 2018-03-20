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
 * Created by ionutmihailescu on 12/9/17.
 */
@Entity
@Table(name = "grup_de_foc")
@Getter
@Setter
public class FireGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "efectiv")
    private Long numberOfEmployees;

    @Column(name = "denumire")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_grupa")
    private Group group;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_caporal")
    private Employee employee;

}
