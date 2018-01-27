package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.MissionResource;
import com.rest.army.dashboard.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Controller
@RequestMapping(value = "/api/mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllMissions() {
        return new ResponseEntity<>(missionService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{missionId}", method = RequestMethod.GET)
    public ResponseEntity getMissionById(@PathVariable(value = "missionId") Long missionId) {
        return new ResponseEntity<>(missionService.findById(missionId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveMission(@RequestBody MissionResource missionResource) {
        missionService.saveMissionResource(missionResource);
    }
}
