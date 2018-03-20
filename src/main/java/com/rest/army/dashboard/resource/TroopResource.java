package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class TroopResource {

    private Long id;
    private CompanyResource company;
    private EmployeeResource employee;
    private long numberOfEmployees;
    private String name;
}
