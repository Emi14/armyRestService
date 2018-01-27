package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.ArmyResource;
import com.rest.army.dashboard.resource.ArmySaveResource;
import com.rest.army.dashboard.service.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ionutmihailescu on 1/14/18.
 */
@Controller
@RequestMapping("/api/army")
public class ArmyController {

    @Autowired
    private ArmyService armyService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllArmies() {
        return new ResponseEntity<>(armyService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{armyId}", method = RequestMethod.GET)
    public ResponseEntity getArmyById(@PathVariable(value = "armyId") Long armyId) {
        return new ResponseEntity<>(armyService.findById(armyId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity saveArmy(@RequestBody ArmySaveResource armyResource) {
        return new ResponseEntity<>(armyService.save(armyResource), HttpStatus.OK);
    }

}
