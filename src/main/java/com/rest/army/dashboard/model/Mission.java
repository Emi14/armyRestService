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
@Table(name = "misiuni")
@Getter
@Setter
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_misiune")
    private Long id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_teatru")
    private Battleground battleground;

//    @ManyToOne(cascade = CascadeType.REFRESH)
//    @JoinColumn(name = "id_tip_misiune", referencedColumnName = "id")
//    private MissionType missionType;

    @Column(name = "stare")
    private String phase;

    @Column(name = "descriere")
    private String description;

    @Column(name = "locatie")
    private String location;

    @Column(name = "data_start")
    private Date startDate;

    @Column(name = "data_sfarsit")
    private Date endDate;

}
