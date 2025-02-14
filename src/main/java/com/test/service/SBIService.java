package com.test.service;

import com.test.entity.SbiEntity;
import com.test.model.SBI;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface  SBIService {

    ArrayList<SbiEntity> openAccount(SBI sbi);
    ArrayList<SbiEntity> getAllDetails();

}
