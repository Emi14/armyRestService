package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 1/27/18.
 */
@Getter
@Setter
public class ArmySaveResource {

    private Long id;
    private String weaponsCategories;
    private Double budget;
    private String headquarters;
    private int activeEmployees;
    private int reserveEmployees;
    private int deployedEmployees;
    private String name;
    private BattlegroundResource battleground;

}
