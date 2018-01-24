package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class EmployeeResource {

    private Long id;
    private ArmyResource army;
    private RoleResource role;
    private Long countryId;
    private String lastName;
    private String firstName;
    private Date birthDate;
    private Date hireDate;
    private String cnp;
    private Double salary;
    private String phone;
    private String email;

}
