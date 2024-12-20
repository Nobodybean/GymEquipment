// 7. Controllers
package com.example.controllers;

import com.example.entity.RepairHistory;
import com.example.services.RepairHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipment")
public class controller {

    @Autowired
    private RepairHistoryService repairHistoryService;

    @GetMapping("/{id}/repairs")
    public List<RepairHistory> getRepairHistory(@PathVariable Long id) {
        return repairHistoryService.getRepairHistoryByEquipmentId(id);
    }

    @PostMapping("/{id}/repairs")
    public RepairHistory logRepair(@PathVariable Long id, @RequestBody RepairHistory repairHistory) {
        return repairHistoryService.addRepairHistory(id, repairHistory);
    }
}
