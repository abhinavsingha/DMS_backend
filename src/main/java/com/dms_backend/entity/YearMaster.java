package com.dms_backend.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "year_master")
public class YearMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 45)
    private String name;

    @Column(name = "createdon")
    private Instant createdOn;

    @Column(name = "updatedon")
    private Instant updatedOn;

}
