// 6. Repositories
package com.example.repositories;

import com.example.entity.RepairHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<RepairHistory, Long> {
}
