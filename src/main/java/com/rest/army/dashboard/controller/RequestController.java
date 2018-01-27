package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.RequestResource;
import com.rest.army.dashboard.service.RequestService;
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
@RequestMapping("/api/request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllRequests() {
        return new ResponseEntity<>(requestService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{requestId}", method = RequestMethod.GET)
    public ResponseEntity getRequestById(@PathVariable("requestId") Long requestId) {
        return new ResponseEntity<>(requestService.findById(requestId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveRequest(@RequestBody RequestResource requestResource) {
        requestService.saveRequest(requestResource);
    }

}
