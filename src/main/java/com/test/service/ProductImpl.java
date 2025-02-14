package com.test.service;

import com.test.exceptiionhandling.BusinessException;
import com.test.model.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements UserService{


    @Override
    public UserDetails saveAddress(UserDetails userDetails) throws BusinessException {
        return userDetails;
    }
}
