package com.example.controllers;

import com.example.entity.MaintenanceSchedule;
import com.example.services.MaintenanceScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipment")
public class MaintenanceScheduleController {

    @Autowired
    private MaintenanceScheduleService maintenanceScheduleService;

    @GetMapping("/{id}/maintenance")
    public List<MaintenanceSchedule> getMaintenanceSchedule(@PathVariable Long id) {
        return maintenanceScheduleService.getMaintenanceScheduleByEquipmentId(id);
    }

    @PostMapping("/{id}/maintenance")
    public MaintenanceSchedule scheduleMaintenance(@PathVariable Long id, @RequestBody MaintenanceSchedule schedule) {
        return maintenanceScheduleService.addMaintenanceSchedule(id, schedule);
    }
}
