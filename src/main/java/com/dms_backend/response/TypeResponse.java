package com.dms_backend.response;

import com.dms_backend.entity.TypeMaster;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class TypeResponse {
    @Setter
    @Getter
    List<TypeMaster> types;
}
