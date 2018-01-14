package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class RegimentResource {

    private Long id;
    private DivisionResource division;
    private EmployeeResource employee;
    private long numberOfEmployees;
    private String name;
}
