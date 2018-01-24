package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.BattlegroundResource;
import com.rest.army.dashboard.service.BattlegroundService;
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
@RequestMapping("/api/battleground")
public class BattlegroundController {

    @Autowired
    private BattlegroundService battlegroundService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ResponseEntity getAllBattlegrounds() {
        return new ResponseEntity<>(battlegroundService.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = "/{battlegroundId}",method = RequestMethod.GET)
    public ResponseEntity getBattlegroundById(@PathVariable(value = "battlegroundId") Long battlegroundId) {
        return new ResponseEntity<>(battlegroundService.findById(battlegroundId),HttpStatus.OK);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseEntity saveBattleground(@RequestBody BattlegroundResource battlegroundResource) {
        return new ResponseEntity<>(battlegroundService.save(battlegroundResource),HttpStatus.OK);
    }

}
