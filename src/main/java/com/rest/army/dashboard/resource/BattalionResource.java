package com.rest.army.dashboard.resource;

import com.rest.army.dashboard.model.Employee;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class BattalionResource {

    private Long id;
    private RegimentResource regiment;
    private Employee employee;
    private long numberOfEmployees;
    private String name;
}
