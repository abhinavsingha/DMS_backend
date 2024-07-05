package com.dms_backend.entity.repository;

import com.dms_backend.entity.YearMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YearRepository extends JpaRepository<YearMaster, Integer> {
}
