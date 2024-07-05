package com.dms_backend.entity.repository;

import com.dms_backend.entity.TypeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeMaster, Integer> {
}
