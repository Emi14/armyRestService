package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Country;
import com.rest.army.dashboard.repository.ICountryRepository;
import com.rest.army.dashboard.resource.CountryResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Service
public class CountryService {

    @Autowired
    private ICountryRepository countryRepository;

    @Autowired
    private Mapper mapper;

    public List<CountryResource> findAll() {
        List<CountryResource> countryResources = new ArrayList<>();
        mapper.mapAsCollection(countryRepository.findAll(), countryResources, CountryResource.class);
        return countryResources;
    }

    public CountryResource findById(Long countryId) {
        CountryResource countryResource = new CountryResource();
        mapper.map(countryRepository.findOne(countryId), countryResource);
        return countryResource;
    }

    public void save(CountryResource countryResource) {
        Country country = new Country();
        mapper.map(countryResource, country);
        countryRepository.saveAndFlush(country);
    }
}
