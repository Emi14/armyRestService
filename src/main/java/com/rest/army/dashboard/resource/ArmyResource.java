package com.rest.army.dashboard.resource;

import com.rest.army.dashboard.model.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Set;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class ArmyResource {

    private Long id;
    private String weaponsCategories;
    private Double budget;
    private String headquarters;
    private int activeEmployees;
    private int reserveEmployees;
    private int deployedEmployees;
    private String name;
}
