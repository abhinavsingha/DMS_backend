package com.dms_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "document_header")
public class DocumentHeader {
    @EmbeddedId
    private DocumentHeaderId id;

    @MapsId("categoryMasterId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_master_id", nullable = false)
    private CategoryMaster categoryMaster;

    @MapsId("yearMasterId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "year_master_id", nullable = false)
    private YearMaster yearMaster;

    @MapsId("typeMasterId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_master_id", nullable = false)
    private TypeMaster typeMaster;

    @Column(name = "title", length = 45)
    private String title;

    @Column(name = "File_no", length = 45)
    private String fileNo;

    @Column(name = "subject", length = 45)
    private String subject;

    @Column(name = "version", length = 45)
    private String version;

    @Column(name = "document_headercol", length = 45)
    private String documentHeadercol;

    @Column(name = "createdOn")
    private Instant createdOn;

    @Column(name = "updatedOn")
    private Instant updatedOn;

    @Column(name = "is_approved")
    private Integer isApproved;

}
