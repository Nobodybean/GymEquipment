package com.example.controllers;

import com.example.entity.UsageHistory;
import com.example.services.UsageHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipment")
public class UsageHistoryController {

    @Autowired
    private UsageHistoryService usageHistoryService;

    @GetMapping("/{id}/usage")
    public List<UsageHistory> getUsageHistory(@PathVariable Long id) {
        return usageHistoryService.getUsageHistoryByEquipmentId(id);
    }

    @PostMapping("/{id}/usage")
    public UsageHistory logUsage(@PathVariable Long id, @RequestBody UsageHistory usageHistory) {
        return usageHistoryService.addUsageHistory(id, usageHistory);
    }
}
