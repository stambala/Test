package com.test.service;

import java.util.List;


import com.test.model.UserAddress;
import com.test.model.UserDetails;


public interface UserService {
	
	List<UserDetails> saveAddress(UserDetails userDetails) throws Exception;
	

}
