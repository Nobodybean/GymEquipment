package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceScheduleService {

    @Autowired
    private com.example.repositories.MaintenanceScheduleRepository maintenanceScheduleRepository;

    public List<com.example.entity.MaintenanceSchedule> getMaintenanceScheduleByEquipmentId(Long equipmentId) {
        return maintenanceScheduleRepository.findAll(); // Add filtering by equipmentId as needed
    }

    public com.example.entity.MaintenanceSchedule addMaintenanceSchedule(Long equipmentId, com.example.entity.MaintenanceSchedule schedule) {
        // Link schedule with equipment
        return maintenanceScheduleRepository.save(schedule);
    }
}
