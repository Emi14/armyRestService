package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class MissionCoordinatesResource {

    private Long id;
    private MissionResource mission;
    private CoordinatesResource coordinates;
}
