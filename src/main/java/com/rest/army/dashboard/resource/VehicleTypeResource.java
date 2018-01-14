package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class VehicleTypeResource {

    private Long id;
    private String name;
    private String description;
    private int capacity;
}