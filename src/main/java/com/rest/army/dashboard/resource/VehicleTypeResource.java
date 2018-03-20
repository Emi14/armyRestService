package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

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
