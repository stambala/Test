package com.test.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class JsonConverter implements AttributeConverter<AccountHolderAddressDetails, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(AccountHolderAddressDetails accountHolderAddressDetails) {
        try {
            return objectMapper.writeValueAsString(accountHolderAddressDetails);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting to JSON", e);
        }
    }

    @Override
    public AccountHolderAddressDetails convertToEntityAttribute(String json) {
        try {
            return objectMapper.readValue(json, AccountHolderAddressDetails.class);
        } catch (Exception e) {
            throw new RuntimeException("Error reading JSON", e);
        }
    }
}
