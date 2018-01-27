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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


/**
 * Created by ionutmihailescu on 12/9/17.
 */
@Entity
@Table(name = "Grupa")
@Getter
@Setter
public class Group {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "efectiv")
    private long numberOfEmployees;

    @Column(name = "denumire")
    private String name;

    @OneToMany(mappedBy = "group")
    private List<FireGroup> fireGroups;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sergent")
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_armata")
    private Army army;
}
