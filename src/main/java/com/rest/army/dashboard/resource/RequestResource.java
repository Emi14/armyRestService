package com.rest.army.dashboard.resource;

import com.rest.army.dashboard.model.RequestType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class RequestResource {

    private Long id;
    private MissionResource mission;
    private EmployeeResource employee;
    private RequestTypeResource reportType;
    private Date dispatchDate;
    private String description;
}
