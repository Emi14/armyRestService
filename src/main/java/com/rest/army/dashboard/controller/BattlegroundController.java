package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Battleground;
import com.rest.army.dashboard.resource.ArmyResource;
import com.rest.army.dashboard.resource.BattalionResource;
import com.rest.army.dashboard.resource.BattlegroundResource;
import com.rest.army.dashboard.resource.FireGroupResource;
import com.rest.army.dashboard.service.BattlegroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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
}
