package com.rest.army.dashboard.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jdk.nashorn.internal.runtime.logging.Logger;
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
 * Created by ionutmihailescu on 12/24/17.
 */

@Entity
@Table(name = "personal")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_personal")
    private Long id;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_armata")
    private Army army;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_functie")
    private Role role;

    @Column(name = "id_tara")
    private Long countryId;

    @Column(name = "prenume")
    private String lastName;

    @Column(name = "nume")
    private String firstName;

    @Column(name = "data_nasterii")
    private Date birthDate;

    @Column(name = "data_angajare")
    private Date hireDate;

    @Column(name = "cnp")
    private String cnp;

    @Column(name = "salariu")
    private Double salary;

    @Column(name = "telefon")
    private String phone;

    @Column(name = "mail")
    private String email;

}
