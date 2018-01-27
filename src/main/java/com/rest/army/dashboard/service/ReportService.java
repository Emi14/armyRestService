package com.rest.army.dashboard.service;

import com.rest.army.dashboard.mapper.Mapper;
import com.rest.army.dashboard.model.Report;
import com.rest.army.dashboard.repository.IReportRepository;
import com.rest.army.dashboard.resource.ReportResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ionutmihailescu on 1/24/18.
 */
@Service
public class ReportService {

    @Autowired
    private IReportRepository reportRepository;

    @Autowired
    private Mapper mapper;

    public List<ReportResource> findAll() {
        List<ReportResource> reportResources = new ArrayList<>();
        mapper.mapAsCollection(reportRepository.findAll(), reportResources, ReportResource.class);
        return reportResources;
    }

    public ReportResource findById(Long reportId) {
        ReportResource reportResource = new ReportResource();
        mapper.map(reportRepository.findOne(reportId), reportResource);
        return reportResource;
    }

    public void saveReport(ReportResource reportResource) {
        Report report = new Report();
        mapper.map(reportResource, report);
        reportRepository.saveAndFlush(report);
    }
}
