package com.test.service;

import java.util.List;


import com.test.exceptiionhandling.BusinessException;
import com.test.model.UserAddress;
import com.test.model.UserDetails;


public interface UserService {
	
	UserDetails saveAddress(UserDetails userDetails) throws BusinessException;
	

}
