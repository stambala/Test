package com.test.model;

import io.micrometer.common.util.StringUtils;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.Serializable;
import java.util.Calendar;

@Data
public class SBI implements Serializable{
    @NotNull
    private String accountNumber;
    @NotNull
    private String accountHolderFirstName;
    @NotNull
    private String accountHolderLastName;
    @NotNull
    private String accountHolderPANCardNumber;
    @NotNull
    private String accountHolderAadharCardNumber;
    @NotNull
    private String accountHolderRegisterEmailAddress;
    @NotNull
    private AccountType accountType;
    @NotNull
    private String accountHolderRegisterMobileNumber;
    @NotNull
    private AccountHolderAddressDetails accountHolderAddressDetails;
    @NotNull
    private String dataOfBirth;

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = RandomStringUtils.random(9);
//    }
}
