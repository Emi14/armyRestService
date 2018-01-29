package com.rest.army.dashboard.resource;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class ReportResource {

    private Long id;
    private MissionResource mission;
    private EmployeeResource employee;
    private ReportTypeResource reportType;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dispatchDate;
    private String description;
}
