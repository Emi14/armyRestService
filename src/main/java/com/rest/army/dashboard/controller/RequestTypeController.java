package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.RequestTypeResource;
import com.rest.army.dashboard.service.RequestTypeService;
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
@RequestMapping("/api/requestType")
public class RequestTypeController {

    @Autowired
    private RequestTypeService requestTypeService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllRequestTypes() {
        return new ResponseEntity<>(requestTypeService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{requestTypeId}", method = RequestMethod.GET)
    public ResponseEntity getRequestById(@PathVariable("requestTypeId") Long requestTypeId) {
        return new ResponseEntity<>(requestTypeService.findById(requestTypeId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity saveRequest(@RequestBody RequestTypeResource requestTypeResource) {
        return new ResponseEntity<>(requestTypeService.saveRequest(requestTypeResource), HttpStatus.OK);
    }

}
