package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class WeaponResource {

    private Long id;
    private ArmyResource army;
    private WeaponTypeResource type;
    private String condition;
    private Date purchaseDate;

}
