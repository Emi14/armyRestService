package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Employee;
import com.rest.army.dashboard.repository.IEmployeeRepository;
import com.rest.army.dashboard.resource.EmployeeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    private Mapper mapper;

    public List<EmployeeResource> findAll() {
        List<EmployeeResource> employeeResources = new ArrayList<>();
        mapper.mapAsCollection(employeeRepository.findAll(), employeeResources, EmployeeResource.class);
        return employeeResources;
    }

    public EmployeeResource findById(Long employeeId) {
        EmployeeResource employeeResource = new EmployeeResource();
        mapper.map(employeeRepository.findOne(employeeId), employeeResource);
        return employeeResource;
    }

    public EmployeeResource saveEmployeeResource(EmployeeResource employeeResource) {
        Employee employee = new Employee();
        mapper.map(employeeResource, employee);
        employee = employeeRepository.saveAndFlush(employee);
        mapper.map(employee,employeeResource);
        return employeeResource;
    }
}
