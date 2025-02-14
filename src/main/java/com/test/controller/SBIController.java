package com.test.controller;

import com.test.entity.SbiEntity;
import com.test.exceptiionhandling.InvalidAccountHolderDetailsException;
import com.test.model.SBI;
import com.test.service.SBIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/sbi")
public class SBIController {

    private static final Logger logger = LoggerFactory.getLogger(SBIController.class);

    @Autowired
    private SBIService sbiService;

        @PostMapping("/accountOpen")
    public ResponseEntity<String> openAccount(@RequestBody SBI sbi) {
            logger.info("Request Starts");
            ArrayList<SbiEntity>  ss = sbiService.openAccount(sbi);
            logger.info("Request Ended");
        return new ResponseEntity<>("", HttpStatus.CREATED);
    }
//    @PostMapping("/accountOpen")
//    public ResponseEntity<?> openAccount(@RequestBody SbiEntity sbi) {
//        try {
//            ArrayList<SbiEntity> ss = sbiService.openAccount(sbi);
//            return new ResponseEntity<>(ss, HttpStatus.CREATED);
//        } catch (InvalidAccountHolderDetailsException e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//        }
//    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<SbiEntity>> getAll(){
        return ResponseEntity.ok(sbiService.getAllDetails());
    }

}
