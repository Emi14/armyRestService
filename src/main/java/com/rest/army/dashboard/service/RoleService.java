package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Role;
import com.rest.army.dashboard.repository.IRoleRepository;
import com.rest.army.dashboard.resource.RoleResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/27/18.
 */
@Service
public class RoleService {

    @Autowired
    private IRoleRepository roleRepository;

    @Autowired
    private Mapper mapper;

    public List<RoleResource> findAll() {
        List<RoleResource> roleResources = new ArrayList<>();
        mapper.mapAsCollection(roleRepository.findAll(), roleResources, RoleResource.class);
        return roleResources;
    }

    public RoleResource findById(Long roleId) {
        RoleResource roleResource = new RoleResource();
        mapper.map(roleRepository.findOne(roleId), roleResource);
        return roleResource;
    }

    public RoleResource save(RoleResource roleResource) {
        Role role = new Role();
        mapper.map(roleResource, role);
        role = roleRepository.saveAndFlush(role);
        mapper.map(role, roleResource);
        return roleResource;
    }
}
