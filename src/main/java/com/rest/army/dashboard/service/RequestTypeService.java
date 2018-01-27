package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.RequestType;
import com.rest.army.dashboard.repository.IRequestTypeRepository;
import com.rest.army.dashboard.resource.RequestTypeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/27/18.
 */
@Service
public class RequestTypeService {

    @Autowired
    private IRequestTypeRepository requestTypeRepository;

    @Autowired
    private Mapper mapper;

    public List<RequestTypeResource> findAll() {
        List<RequestTypeResource> requestTypeResources = new ArrayList<>();
        mapper.mapAsCollection(requestTypeRepository.findAll(), requestTypeResources, RequestTypeResource.class);
        return requestTypeResources;
    }

    public RequestTypeResource findById(Long requestTypeId) {
        RequestTypeResource requestTypeResource = new RequestTypeResource();
        mapper.map(requestTypeRepository.findOne(requestTypeId), requestTypeResource);
        return requestTypeResource;
    }

    public void saveRequest(RequestTypeResource requestTypeResource) {
        RequestType requestType = new RequestType();
        mapper.map(requestTypeResource, requestType);
        requestTypeRepository.saveAndFlush(requestType);
    }
}
