package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Army;
import com.rest.army.dashboard.repository.IArmyRepository;
import com.rest.army.dashboard.resource.ArmyResource;
import com.rest.army.dashboard.resource.ArmySaveResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/14/18.
 */

@Service
public class ArmyService {

    @Autowired
    private IArmyRepository armyRepository;

    @Autowired
    private Mapper mapper;

    public List<ArmyResource> findAll() {
        List<ArmyResource> armyResources = new ArrayList<>();
        mapper.mapAsCollection(armyRepository.findAll(), armyResources, ArmyResource.class);
        return armyResources;
    }

    public ArmyResource findById(Long armyId) {
        ArmyResource armyResource = new ArmyResource();
        mapper.map(armyRepository.findOne(armyId), armyResource);
        return armyResource;
    }

    public ArmySaveResource save(ArmySaveResource armyResource) {
        Army army = new Army();
        mapper.map(armyResource, army);
        army = armyRepository.saveAndFlush(army);
        mapper.map(army,armyResource);
        return armyResource;
    }
}
