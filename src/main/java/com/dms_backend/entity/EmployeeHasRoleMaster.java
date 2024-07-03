package com.dms_backend.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee_has_role_master")
public class EmployeeHasRoleMaster {
    @EmbeddedId
    private EmployeeHasRoleMasterId id;

    //TODO [JPA Buddy] generate columns from DB
}
