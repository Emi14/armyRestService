package com.rest.army.dashboard.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
import java.util.Set;

/**
 * Created by ionutmihailescu on 12/24/17.
 */

@Entity
@Table(name = "armata")
@Getter
@Setter
public class Army {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_armata")
    private Long id;

    @Column(name = "categorie_de_arme")
    private String weaponsCategories;

    @Column(name = "buget")
    private Double budget;

    @Column(name = "sediul")
    private String headquarters;

    @Column(name = "personal_activ")
    private int activeEmployees;

    @Column(name = "personal_in_rezerva")
    private int reserveEmployees;

    @Column(name = "personal_desfasurat")
    private int deployedEmployees;

    @Column(name = "denumire")
    private String name;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teatru")
    private Battleground battleground;

}
