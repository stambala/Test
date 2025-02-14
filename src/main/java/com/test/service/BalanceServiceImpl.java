package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService{
    @Override
    public Double checkBalance(String accountNumber) {
        return 0.0;
    }
}
