package com.dms_backend.service;

import com.dms_backend.request.TypeRequest;
import com.dms_backend.response.ApiResponse;
import com.dms_backend.response.TypeResponse;

public interface TypeService {
    ApiResponse<TypeResponse> getAllType();

    ApiResponse<TypeResponse> setTypeData(TypeRequest typeRequest);
}
