package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class CoordinatesResource {

    private Long id;
    private Double latitude;
    private Double longitude;
    private Double altitude;
}
