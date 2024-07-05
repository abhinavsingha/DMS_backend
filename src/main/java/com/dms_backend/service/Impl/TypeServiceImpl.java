package com.dms_backend.service.Impl;

import com.dms_backend.entity.TypeMaster;
import com.dms_backend.entity.repository.TypeRepository;
import com.dms_backend.request.TypeRequest;
import com.dms_backend.response.ApiResponse;
import com.dms_backend.response.TypeResponse;
import com.dms_backend.service.TypeService;
import com.dms_backend.utils.ResponseUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeRepository typeRepository;
    @Override
    public ApiResponse<TypeResponse> getAllType(){
        TypeResponse typeResponse=new TypeResponse();
        List<TypeMaster> allTypes = typeRepository.findAll();
        typeResponse.setTypes(allTypes);
        return ResponseUtils.createSuccessResponse(typeResponse, new TypeReference<TypeResponse>() {});
    }

    @Override
    public ApiResponse<TypeResponse> setTypeData(TypeRequest typeRequest) {
        TypeResponse typeResponse=new TypeResponse();
        if(typeRequest.getType()!=null){

            TypeMaster type=new TypeMaster();
            type.setName(typeRequest.getType());
            type.setCreatedOn(Instant.now());
            type.setUpdatedOn(Instant.now());
            typeRepository.save(type);
            return ResponseUtils.createSuccessResponse(typeResponse, new TypeReference<TypeResponse>() {});
        }else{
            return ResponseUtils.createFailureResponse(typeResponse, new TypeReference<TypeResponse>() {},"Type cannot be null",500);
        }

    }
}
