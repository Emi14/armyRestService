package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.MissionCoordinates;
import com.rest.army.dashboard.repository.IMissionCoordinatesRepository;
import com.rest.army.dashboard.resource.MissionCoordinatesResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/27/18.
 */
@Service
public class MissionCoordinatesService {

    @Autowired
    private IMissionCoordinatesRepository missionCoordinatesRepository;

    @Autowired
    private Mapper mapper;


    public List<MissionCoordinatesResource> findAll() {
        List<MissionCoordinatesResource> missionCoordinatesResources = new ArrayList<>();
        mapper.mapAsCollection(missionCoordinatesRepository.findAll(),
                missionCoordinatesResources, MissionCoordinatesResource.class);
        return missionCoordinatesResources;
    }

    public MissionCoordinatesResource findById(Long missionCoordinatesId) {
        MissionCoordinatesResource missionCoordinatesResource = new MissionCoordinatesResource();
        mapper.map(missionCoordinatesRepository.findOne(missionCoordinatesId), missionCoordinatesResource);
        return missionCoordinatesResource;
    }

    public void saveReport(MissionCoordinatesResource missionCoordinatesResource) {
        MissionCoordinates missionCoordinates = new MissionCoordinates();
        mapper.map(missionCoordinatesResource, missionCoordinates);
        missionCoordinatesRepository.saveAndFlush(missionCoordinates);
    }
}
