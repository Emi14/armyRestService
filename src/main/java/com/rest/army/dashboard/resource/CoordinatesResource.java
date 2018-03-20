package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

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
