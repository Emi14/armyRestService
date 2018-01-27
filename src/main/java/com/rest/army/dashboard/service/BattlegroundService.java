package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Battleground;
import com.rest.army.dashboard.repository.IBattlegroundRepository;
import com.rest.army.dashboard.resource.BattlegroundResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/14/18.
 */
@Service
public class BattlegroundService {

    @Autowired
    private IBattlegroundRepository battlegroundRepository;

    @Autowired
    private Mapper mapper;

    public List<BattlegroundResource> findAll() {
        List<BattlegroundResource> battlegroundResources = new ArrayList<>();
        List<Battleground> battlegrounds = battlegroundRepository.findAll();
        mapper.mapAsCollection(battlegrounds, battlegroundResources, BattlegroundResource.class);
        return battlegroundResources;
    }

    public BattlegroundResource findById(Long battlegroundId) {
        BattlegroundResource battlegroundResource = new BattlegroundResource();
        mapper.map(battlegroundRepository.findOne(battlegroundId), battlegroundResource);
        return battlegroundResource;
    }

    public BattlegroundResource save(BattlegroundResource battlegroundResource) {
        Battleground battleground = new Battleground();
        mapper.map(battlegroundResource, battleground);
        battleground = battlegroundRepository.saveAndFlush(battleground);
        mapper.map(battleground, battlegroundResource);
        return battlegroundResource;
    }
}
