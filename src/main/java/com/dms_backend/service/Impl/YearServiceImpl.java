package com.dms_backend.service.Impl;

import com.dms_backend.entity.YearMaster;
import com.dms_backend.entity.repository.YearRepository;
import com.dms_backend.request.YearRequest;
import com.dms_backend.response.ApiResponse;
import com.dms_backend.response.YearResponse;
import com.dms_backend.service.YearService;
import com.dms_backend.utils.ResponseUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class YearServiceImpl implements YearService {

    @Autowired
    YearRepository yearRepository;
    @Override
    public ApiResponse<YearResponse> getAllYear(){
        YearResponse yearResponse=new YearResponse();
        List<YearMaster> allYears = yearRepository.findAll();
        yearResponse.setYears(allYears);
        return ResponseUtils.createSuccessResponse(yearResponse, new TypeReference<YearResponse>() {});
    }

    @Override
    public ApiResponse<YearResponse> setYearData(YearRequest yearRequest) {
        YearResponse yearResponse=new YearResponse();
        if(yearRequest.getYear()!=null){

            YearMaster year=new YearMaster();
            year.setName(yearRequest.getYear());
            year.setCreatedOn(Instant.now());
            year.setUpdatedOn(Instant.now());
            yearRepository.save(year);
            return ResponseUtils.createSuccessResponse(yearResponse, new TypeReference<YearResponse>() {});
        }else{
            return ResponseUtils.createFailureResponse(yearResponse, new TypeReference<YearResponse>() {},"Year cannot be null",500);
        }

    }
}
