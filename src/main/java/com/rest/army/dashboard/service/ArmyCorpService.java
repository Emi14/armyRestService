package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.repository.IArmyCorpRepository;
import com.rest.army.dashboard.resource.ArmyCorpResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Service
public class ArmyCorpService {

    @Autowired
    private IArmyCorpRepository armyCorpRepository;

    @Autowired
    private Mapper mapper;

    public List<ArmyCorpResource> findAll(){
        List<ArmyCorpResource> armyCorpResources = new ArrayList<>();
        mapper.mapAsCollection(armyCorpRepository.findAll(),armyCorpResources,ArmyCorpResource.class);
        return armyCorpResources;
    }
}
