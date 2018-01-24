package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.EmployeeResource;
import com.rest.army.dashboard.service.EmployeeService;
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
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllEmployees(){
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
    public ResponseEntity getEmployeeById(@PathVariable(value = "employeeId") Long employeeId){
        return new ResponseEntity<>(employeeService.findById(employeeId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveEmployee(@RequestBody EmployeeResource employeeResource){
        employeeService.saveEmployeeResource(employeeResource);
    }

}
