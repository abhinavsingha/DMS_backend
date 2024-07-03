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
public class DocumentDetailId implements Serializable {
    private static final long serialVersionUID = 53568740742110550L;
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "document_header_id", nullable = false)
    private Integer documentHeaderId;

    @Column(name = "document_header_category_master_id", nullable = false)
    private Integer documentHeaderCategoryMasterId;

    @Column(name = "document_header_year_master_id", nullable = false)
    private Integer documentHeaderYearMasterId;

    @Column(name = "document_header_type_master_id", nullable = false)
    private Integer documentHeaderTypeMasterId;

    @Column(name = "document_header_Employee_id", nullable = false)
    private Integer documentHeaderEmployeeId;

    @Column(name = "document_header_Employee_department_master_Id", nullable = false)
    private Integer documentHeaderEmployeeDepartmentMasterId;

    @Column(name = "document_header_Employee_department_master_branch_Master_Id", nullable = false)
    private Integer documentHeaderEmployeeDepartmentMasterBranchMasterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DocumentDetailId entity = (DocumentDetailId) o;
        return Objects.equals(this.documentHeaderYearMasterId, entity.documentHeaderYearMasterId) &&
                Objects.equals(this.documentHeaderTypeMasterId, entity.documentHeaderTypeMasterId) &&
                Objects.equals(this.documentHeaderEmployeeDepartmentMasterId, entity.documentHeaderEmployeeDepartmentMasterId) &&
                Objects.equals(this.documentHeaderCategoryMasterId, entity.documentHeaderCategoryMasterId) &&
                Objects.equals(this.documentHeaderId, entity.documentHeaderId) &&
                Objects.equals(this.documentHeaderEmployeeId, entity.documentHeaderEmployeeId) &&
                Objects.equals(this.documentHeaderEmployeeDepartmentMasterBranchMasterId, entity.documentHeaderEmployeeDepartmentMasterBranchMasterId) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentHeaderYearMasterId, documentHeaderTypeMasterId, documentHeaderEmployeeDepartmentMasterId, documentHeaderCategoryMasterId, documentHeaderId, documentHeaderEmployeeId, documentHeaderEmployeeDepartmentMasterBranchMasterId, id);
    }

}
