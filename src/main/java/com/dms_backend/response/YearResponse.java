package com.dms_backend.response;

import com.dms_backend.entity.YearMaster;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

public class YearResponse {
    @Setter
    @Getter
    List<YearMaster> years;
}
