package com.test.model;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;

@Data
public class AccountHolderAddressDetails implements Serializable {
    @NotNull
    private String accountHolderDoreNumber;
    @NotNull
    private String accountHolderStreetName;
    @NotNull
    private String accountHolderVillageName;
    @NotNull
    private String accountHolderCityName;
    @NotNull
    private String accountHolderMandalName;
    @NotNull
    private String accountHolderDistrictName;
    @NotNull
    private String accountHolderStateName;
    @NotNull
    private Integer accountHolderPinCode;


}
