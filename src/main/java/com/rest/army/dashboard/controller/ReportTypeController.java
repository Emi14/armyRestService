package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.ReportTypeResource;
import com.rest.army.dashboard.service.ReportTypeService;
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
@RequestMapping(value = "/api/reportType")
public class ReportTypeController {

    @Autowired
    private ReportTypeService reportTypeService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllReportTypes() {
        return new ResponseEntity<>(reportTypeService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{reportTypeId}", method = RequestMethod.GET)
    public ResponseEntity getReportTypeById(@PathVariable("reportTypeId") Long reportTypeId) {
        return new ResponseEntity<>(reportTypeService.findById(reportTypeId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity saveReport(@RequestBody ReportTypeResource reportTypeResource) {
        return new ResponseEntity<>(reportTypeService.saveReport(reportTypeResource), HttpStatus.OK);
    }
}

