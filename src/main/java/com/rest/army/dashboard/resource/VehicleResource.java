package com.rest.army.dashboard.resource;

import com.rest.army.dashboard.model.Army;
import com.rest.army.dashboard.model.VehicleType;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
public class VehicleResource {

    private Long id;
    private ArmyResource army;
    private VehicleTypeResource type;
    private String condition;
    private Date purchaseDate;
}
