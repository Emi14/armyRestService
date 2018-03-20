package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.ReportResource;
import com.rest.army.dashboard.service.ReportService;
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
@RequestMapping(value = "/api/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllReports() {
        return new ResponseEntity<>(reportService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{reportId}", method = RequestMethod.GET)
    public ResponseEntity getReportById(@PathVariable("reportId") Long reportId) {
        return new ResponseEntity<>(reportService.findById(reportId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity saveReport(@RequestBody ReportResource reportResource) {
        return new ResponseEntity<>(reportService.saveReport(reportResource), HttpStatus.OK);
    }
}
