package com.rest.army.dashboard.resource;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
@Getter
@Setter
public class BattlegroundResource {

    private Long id;
    private CountryResource country;
    private EmployeeResource employee;
    private long armyCount;
    private String name;
}
