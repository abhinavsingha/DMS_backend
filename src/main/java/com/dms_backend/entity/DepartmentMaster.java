package com.dms_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "department_master")
public class DepartmentMaster {
    @EmbeddedId
    private DepartmentMasterId id;

    @MapsId("branchMasterId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "branch_Master_Id", nullable = false)
    private BranchMaster branchMaster;

    @Column(name = "Name", nullable = false, length = 45)
    private String name;

    @Column(name = "createdOn")
    private Instant createdOn;

    @Column(name = "updatedOn")
    private Instant updatedOn;

    @Column(name = "isActive")
    private Integer isActive;

}
