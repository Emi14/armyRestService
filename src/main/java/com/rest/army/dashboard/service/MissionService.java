package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Mission;
import com.rest.army.dashboard.repository.IMissionRepository;
import com.rest.army.dashboard.resource.MissionResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Service
public class MissionService {

    @Autowired
    private IMissionRepository missionRepository;

    @Autowired
    private Mapper mapper;

    public List<MissionResource> findAll() {
        List<MissionResource> missionResources = new ArrayList<>();
        mapper.mapAsCollection(missionRepository.findAll(), missionResources, MissionResource.class);
        return missionResources;
    }

    public MissionResource findById(Long missionId) {
        MissionResource missionResource = new MissionResource();
        mapper.map(missionRepository.findOne(missionId), missionResource);
        return missionResource;
    }


    public MissionResource saveMissionResource(MissionResource missionResource) {
        Mission mission = new Mission();
        mapper.map(missionResource, mission);
        mission = missionRepository.saveAndFlush(mission);
        mapper.map(mission, missionResource);
        return missionResource;
    }
}
