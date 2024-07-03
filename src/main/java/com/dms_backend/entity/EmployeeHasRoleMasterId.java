package com.dms_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EmployeeHasRoleMasterId implements Serializable {
    private static final long serialVersionUID = 205518312264616609L;
    @Column(name = "Employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "Employee_department_master_Id", nullable = false)
    private Integer employeeDepartmentMasterId;

    @Column(name = "Employee_department_master_branch_Master_Id", nullable = false)
    private Integer employeeDepartmentMasterBranchMasterId;

    @Column(name = "role_master_id", nullable = false)
    private Integer roleMasterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeeHasRoleMasterId entity = (EmployeeHasRoleMasterId) o;
        return Objects.equals(this.employeeDepartmentMasterBranchMasterId, entity.employeeDepartmentMasterBranchMasterId) &&
                Objects.equals(this.roleMasterId, entity.roleMasterId) &&
                Objects.equals(this.employeeDepartmentMasterId, entity.employeeDepartmentMasterId) &&
                Objects.equals(this.employeeId, entity.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeDepartmentMasterBranchMasterId, roleMasterId, employeeDepartmentMasterId, employeeId);
    }

}
