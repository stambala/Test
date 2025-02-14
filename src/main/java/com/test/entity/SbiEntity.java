package com.test.entity;

import com.test.model.AccountHolderAddressDetails;
import com.test.model.AccountType;
import com.test.model.JsonConverter;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.Calendar;

@Entity
@Data
public class SbiEntity {

    @Id
    @Column(nullable = false, unique = true, length = 16)
    private String id;

    private String accountNumber;

    private String accountHolderFirstName;

    private String accountHolderLastName;

    private String accountHolderPANCardNumber;

    private String accountHolderAadharCardNumber;

    private String accountHolderRegisterEmailAddress;

    private AccountType accountType;

    private String accountHolderRegisterMobileNumber;

//    private AccountHolderAddressDetails accountHolderAddressDetails;

    @Convert(converter = JsonConverter.class)
    @Column(columnDefinition = "TEXT")
    private AccountHolderAddressDetails accountHolderAddressDetails;

    private String dataOfBirth;

    public SbiEntity() {

        this.id = generateCustomId();
    }

    private String generateCustomId() {
        return String.format("%04d-%04d-%06d",
                (int) (Math.random() * 10000),
                (int) (Math.random() * 10000),
                (int) (Math.random() * 10000),
                (int) (Math.random() * 10000));
    }

}
