package com.test.service;

import java.util.List;


import com.test.model.UserAddress;


public interface UserService {
	
	List<UserAddress> saveAddress(UserAddress userAddress);
	

}
