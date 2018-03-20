package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.repository.IFireGroupRepository;
import com.rest.army.dashboard.resource.FireGroupResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 12/9/17.
 */
@Controller
@RequestMapping(value = "/api/fireGroup")
public class FireGroupController {

    @Autowired
    private IFireGroupRepository fireGroupRepository;

    @Autowired
    private Mapper mapper;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public HttpEntity<List<FireGroupResource>> getFireGroup() {
        List<FireGroupResource> fireGroupResources = new ArrayList<>();
        mapper.mapAsCollection(fireGroupRepository.findAll(), fireGroupResources, FireGroupResource.class);
        return new ResponseEntity<>(fireGroupResources, HttpStatus.OK);
    }

}
