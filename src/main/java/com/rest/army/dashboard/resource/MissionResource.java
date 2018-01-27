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
public class MissionResource {


    private Long id;
    private BattlegroundResource battleground;
    private String phase;
    private String description;
    private String location;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date endDate;
}
