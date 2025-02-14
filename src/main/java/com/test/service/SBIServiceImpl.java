package com.test.service;

import com.test.entity.SbiEntity;
import com.test.exceptiionhandling.InvalidAccountHolderDetailsException;
import com.test.model.SBI;
import com.test.respository.SBIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SBIServiceImpl implements SBIService {
    @Autowired
    private SBIRepository sbiRepository;

    @Override
    public ArrayList<SbiEntity> openAccount(SBI sbi) {

        boolean isValid = validatingAccountDetails(sbi);
        if (isValid) {
            SbiEntity s = new SbiEntity();
            s.setAccountHolderFirstName(sbi.getAccountHolderFirstName());
            s.setAccountHolderLastName(sbi.getAccountHolderLastName());
            s.setAccountNumber(sbi.getAccountNumber());
            s.setAccountType(sbi.getAccountType());
            s.setAccountHolderAadharCardNumber(sbi.getAccountHolderAadharCardNumber());
            s.setAccountHolderPANCardNumber(sbi.getAccountHolderPANCardNumber());
            s.setAccountHolderRegisterEmailAddress(sbi.getAccountHolderRegisterEmailAddress());
            s.setAccountHolderRegisterMobileNumber(sbi.getAccountHolderRegisterMobileNumber());
            s.setAccountHolderAddressDetails(sbi.getAccountHolderAddressDetails());
            s.setDataOfBirth(sbi.getDataOfBirth());
            s = sbiRepository.save(s);
        } else {
            throw new InvalidAccountHolderDetailsException();
        }
        return null;
    }

    @Override
    public ArrayList<SbiEntity> getAllDetails() {
        return new ArrayList<>(sbiRepository.findAll());
    }

    private Boolean validatingAccountDetails(SBI sbi) {

        if (sbi.getAccountNumber() == null || sbi.getAccountHolderFirstName() == null
                || sbi.getAccountHolderLastName() == null
                || sbi.getAccountHolderAadharCardNumber() == null
                || sbi.getAccountType() == null || sbi.getDataOfBirth() == null
                || sbi.getAccountHolderPANCardNumber() == null || sbi.getAccountHolderRegisterEmailAddress() == null
                || sbi.getAccountHolderRegisterMobileNumber() == null || sbi.getAccountHolderAddressDetails() == null) {
            throw new InvalidAccountHolderDetailsException();
        }

        return true;

    }

//    private Boolean validatingAccountDetails(SbiEntity sbi) {
//        if (sbi.getAccountNumber() == null) {
//            throw new InvalidAccountHolderDetailsException("Account number is required");
//        }
//        if (sbi.getAccountHolderFirstName() == null) {
//            throw new InvalidAccountHolderDetailsException("First name is required");
//        }
//        if (sbi.getAccountHolderLastName() == null) {
//            throw new InvalidAccountHolderDetailsException("Last name is required");
//        }
//        if (sbi.getAccountHolderAadharCardNumber() == null) {
//            throw new InvalidAccountHolderDetailsException("Aadhar card number is required");
//        }
//        if (sbi.getAccountType() == null) {
//            throw new InvalidAccountHolderDetailsException("Account type is required");
//        }
//        if (sbi.getDataOfBirth() == null) {
//            throw new InvalidAccountHolderDetailsException("Date of birth is required");
//        }
//        if (sbi.getAccountHolderPANCardNumber() == null) {
//            throw new InvalidAccountHolderDetailsException("PAN card number is required");
//        }
//        if (sbi.getAccountHolderRegisterEmailAddress() == null) {
//            throw new InvalidAccountHolderDetailsException("Email address is required");
//        }
//        if (sbi.getAccountHolderRegisterMobileNumber() == null) {
//            throw new InvalidAccountHolderDetailsException("Mobile number is required");
//        }
//        if (sbi.getAccountHolderAddresses() == null) {
//            throw new InvalidAccountHolderDetailsException("Address details are required");
//        }
//
//        return true;
//    }

}
