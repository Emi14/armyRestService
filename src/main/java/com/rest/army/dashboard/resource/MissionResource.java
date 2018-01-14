package com.rest.army.dashboard.resource;

import java.util.Date;

/**
 * Created by ionutmihailescu on 1/2/18.
 */
public class MissionResource {


    private Long id;
    private BattlegroundResource battleground;
    private MissionTypeResource missionType;
    private String phase;
    private String description;
    private String location;
    private Date startDate;
    private Date endDate;
}
