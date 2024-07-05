package com.dms_backend.service;

import com.dms_backend.request.YearRequest;
import com.dms_backend.response.ApiResponse;
import com.dms_backend.response.YearResponse;

public interface YearService {
    ApiResponse<YearResponse> getAllYear();

    ApiResponse<YearResponse> setYearData(YearRequest yearRequest);
}
