package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.ReportType;
import com.rest.army.dashboard.repository.IReportTypeRepository;
import com.rest.army.dashboard.resource.ReportTypeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/27/18.
 */
@Service
public class ReportTypeService {

    @Autowired
    private IReportTypeRepository reportTypeRepository;

    @Autowired
    private Mapper mapper;

    public List<ReportTypeResource> findAll() {
        List<ReportTypeResource> reportTypeResources = new ArrayList<>();
        mapper.mapAsCollection(reportTypeRepository.findAll(), reportTypeResources, ReportTypeResource.class);
        return reportTypeResources;
    }

    public ReportTypeResource findById(Long reportTypeId) {
        ReportTypeResource reportTypeResource = new ReportTypeResource();
        mapper.map(reportTypeRepository.findOne(reportTypeId), reportTypeResource);
        return reportTypeResource;
    }

    public void saveReport(ReportTypeResource reportTypeResource) {
        ReportType reportType = new ReportType();
        mapper.map(reportTypeResource, reportType);
        reportTypeRepository.saveAndFlush(reportType);
    }
}
