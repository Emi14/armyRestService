package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.MissionCoordinatesResource;
import com.rest.army.dashboard.service.MissionCoordinatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ionutmihailescu on 1/27/18.
 */
@Controller
@RequestMapping(value = "api/missionCoordinates")
public class MissionCoordinatesController {

    @Autowired
    private MissionCoordinatesService missionCoordinatesService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllMissionCoordinates() {
        return new ResponseEntity<>(missionCoordinatesService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{missionCoordinatesId}", method = RequestMethod.GET)
    public ResponseEntity getAllMissionCoordinateById(@PathVariable("missionCoordinatesId") Long missionCoordinatesId) {
        return new ResponseEntity<>(missionCoordinatesService.findById(missionCoordinatesId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveReport(@RequestBody MissionCoordinatesResource missionCoordinatesResource) {
        missionCoordinatesService.saveReport(missionCoordinatesResource);
    }
}
