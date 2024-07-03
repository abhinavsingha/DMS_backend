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
public class EmployeeId implements Serializable {
    private static final long serialVersionUID = -4632345805478532911L;
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "department_master_Id", nullable = false)
    private Integer departmentMasterId;

    @Column(name = "department_master_branch_Master_Id", nullable = false)
    private Integer departmentMasterBranchMasterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeeId entity = (EmployeeId) o;
        return Objects.equals(this.departmentMasterBranchMasterId, entity.departmentMasterBranchMasterId) &&
                Objects.equals(this.departmentMasterId, entity.departmentMasterId) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentMasterBranchMasterId, departmentMasterId, id);
    }

}
