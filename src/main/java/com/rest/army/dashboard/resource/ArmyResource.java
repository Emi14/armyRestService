package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

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
