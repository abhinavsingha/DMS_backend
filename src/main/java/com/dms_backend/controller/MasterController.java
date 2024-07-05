package com.dms_backend.controller;

import com.dms_backend.request.TypeRequest;
import com.dms_backend.request.YearRequest;
import com.dms_backend.response.ApiResponse;
import com.dms_backend.response.TypeResponse;
import com.dms_backend.response.YearResponse;
import com.dms_backend.service.TypeService;
import com.dms_backend.service.YearService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/master")
@Slf4j
public class MasterController {
    @Autowired
    private TypeService typeService;
    @Autowired
    private YearService yearService;
    @GetMapping("/getAllType")
    public ResponseEntity<ApiResponse<TypeResponse>> getAllType() {
        return new ResponseEntity<>(typeService.getAllType(), HttpStatus.OK);
    }
    @PostMapping("/setType")
    public ResponseEntity<ApiResponse<TypeResponse>> setType(@RequestBody TypeRequest typeRequest) {
        return new ResponseEntity<>(typeService.setTypeData(typeRequest), HttpStatus.OK);
    }
    @GetMapping("/getAllYear")
    public ResponseEntity<ApiResponse<YearResponse>> getAllYear() {
        return new ResponseEntity<>(yearService.getAllYear(), HttpStatus.OK);
    }
    @PostMapping("/setYear")
    public ResponseEntity<ApiResponse<YearResponse>> setYear(@RequestBody YearRequest yearRequest) {
        return new ResponseEntity<>(yearService.setYearData(yearRequest), HttpStatus.OK);
    }
}
