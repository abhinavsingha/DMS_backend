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
public class DepartmentMasterId implements Serializable {
    private static final long serialVersionUID = 7728224541003142131L;
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Column(name = "branch_Master_Id", nullable = false)
    private Integer branchMasterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DepartmentMasterId entity = (DepartmentMasterId) o;
        return Objects.equals(this.branchMasterId, entity.branchMasterId) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchMasterId, id);
    }

}
