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
public class DocumentHeaderId implements Serializable {
    private static final long serialVersionUID = -5691069528643263349L;
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category_master_id", nullable = false)
    private Integer categoryMasterId;

    @Column(name = "year_master_id", nullable = false)
    private Integer yearMasterId;

    @Column(name = "type_master_id", nullable = false)
    private Integer typeMasterId;

    @Column(name = "Employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "Employee_department_master_Id", nullable = false)
    private Integer employeeDepartmentMasterId;

    @Column(name = "Employee_department_master_branch_Master_Id", nullable = false)
    private Integer employeeDepartmentMasterBranchMasterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DocumentHeaderId entity = (DocumentHeaderId) o;
        return Objects.equals(this.employeeDepartmentMasterBranchMasterId, entity.employeeDepartmentMasterBranchMasterId) &&
                Objects.equals(this.categoryMasterId, entity.categoryMasterId) &&
                Objects.equals(this.typeMasterId, entity.typeMasterId) &&
                Objects.equals(this.employeeDepartmentMasterId, entity.employeeDepartmentMasterId) &&
                Objects.equals(this.employeeId, entity.employeeId) &&
                Objects.equals(this.id, entity.id) &&
                Objects.equals(this.yearMasterId, entity.yearMasterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeDepartmentMasterBranchMasterId, categoryMasterId, typeMasterId, employeeDepartmentMasterId, employeeId, id, yearMasterId);
    }

}
