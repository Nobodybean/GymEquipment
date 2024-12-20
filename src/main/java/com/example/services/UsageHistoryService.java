// 8. Services
package com.example.services;

import com.example.entity.UsageHistory;
import com.example.repositories.UsageHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsageHistoryService {

    @Autowired
    private UsageHistoryRepository usageHistoryRepository;

    public List<UsageHistory> getUsageHistoryByEquipmentId(Long equipmentId) {
        return usageHistoryRepository.findAll(); // Add filtering by equipmentId as needed
    }

    public UsageHistory addUsageHistory(Long equipmentId, UsageHistory usageHistory) {
        // Link usageHistory with equipment
        return usageHistoryRepository.save(usageHistory);
    }
}

