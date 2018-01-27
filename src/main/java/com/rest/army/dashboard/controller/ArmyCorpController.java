package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.service.ArmyCorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Controller
@RequestMapping(value = "/api/armyCorp")
public class ArmyCorpController {

    @Autowired
    private ArmyCorpService armyCorpService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity getAllArmyCorps() {
        return new ResponseEntity(armyCorpService.findAll(), HttpStatus.OK);
    }

}
