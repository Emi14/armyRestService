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
public class EmployeeResource {

    private Long id;
    private ArmyResource army;
    private RoleResource role;
    private Long countryId;
    private String lastName;
    private String firstName;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date hireDate;
    private String cnp;
    private Double salary;
    private String phone;
    private String email;

}
