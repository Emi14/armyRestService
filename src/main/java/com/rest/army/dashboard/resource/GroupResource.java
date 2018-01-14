package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class GroupResource {

    private long id;
    private long numberOfEmployees;
    private String name;
    private List<FireGroupResource> fireGroups;
    private EmployeeResource employee;
    private ArmyResource army;
}
