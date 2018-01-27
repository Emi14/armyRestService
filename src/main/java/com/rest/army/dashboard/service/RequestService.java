package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Request;
import com.rest.army.dashboard.repository.IRequestRepository;
import com.rest.army.dashboard.resource.RequestResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Service
public class RequestService {

    @Autowired
    private IRequestRepository requestRepository;

    @Autowired
    private Mapper mapper;

    public List<RequestResource> findAll() {
        List<RequestResource> requestResources = new ArrayList<>();
        mapper.mapAsCollection(requestRepository.findAll(), requestResources, RequestResource.class);
        return requestResources;
    }

    public RequestResource findById(Long requestId) {
        RequestResource requestResource = new RequestResource();
        mapper.map(requestRepository.findOne(requestId), requestResource);
        return requestResource;
    }

    public RequestResource saveRequest(RequestResource requestResource) {
        Request request = new Request();
        mapper.map(requestRepository, request);
        request = requestRepository.saveAndFlush(request);
        mapper.map(request, requestResource);
        return requestResource;
    }
}
