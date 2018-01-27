package com.rest.army.dashboard.controller;

import com.rest.army.dashboard.resource.CountryResource;
import com.rest.army.dashboard.service.CountryService;
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
@RequestMapping(value = "/api/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllCountries() {
        return new ResponseEntity<>(countryService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{countryId}", method = RequestMethod.GET)
    public ResponseEntity getCountryById(@PathVariable("countryId") Long countryId) {
        return new ResponseEntity<>(countryService.findById(countryId), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void getAllCountries(@RequestBody CountryResource countryResource) {
        countryService.save(countryResource);
    }

}
