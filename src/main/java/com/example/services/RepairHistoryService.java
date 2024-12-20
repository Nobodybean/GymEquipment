package com.example.services;

import com.example.repositories.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairHistoryService {

    @Autowired
    private repository repairHistoryRepository;

    public List<com.example.entity.RepairHistory> getRepairHistoryByEquipmentId(Long equipmentId) {
        return repairHistoryRepository.findAll(); // Add filtering by equipmentId as needed
    }

    public com.example.entity.RepairHistory addRepairHistory(Long equipmentId, com.example.entity.RepairHistory repairHistory) {
        // Link repairHistory with equipment
        return repairHistoryRepository.save(repairHistory);
    }
}
