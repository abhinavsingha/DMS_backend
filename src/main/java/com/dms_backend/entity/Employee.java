package com.dms_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @EmbeddedId
    private EmployeeId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "department_master_Id", referencedColumnName = "Id", nullable = false),
            @JoinColumn(name = "department_master_branch_Master_Id", referencedColumnName = "branch_Master_Id", nullable = false)
    })
    private DepartmentMaster departmentMaster;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "EmployeeId", length = 45)
    private String employeeId;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Column(name = "mobile", nullable = false, length = 14)
    private String mobile;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "isActive", nullable = false)
    private Integer isActive;

    @Column(name = "otp")
    private Integer otp;

    @Column(name = "createdOn")
    private Instant createdOn;

    @Column(name = "updatedOn")
    private Instant updatedOn;

}
