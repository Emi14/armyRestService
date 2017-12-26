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
@Table(name = "cereri")
@Getter
@Setter
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_misiune")
    private Mission mission;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_operator")
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tip")
    private ReportType reportType;

    @Column(name = "data_trimitere")
    private Date dispatchDate;

    @Column(name = "descriere")
    private String description;

}
