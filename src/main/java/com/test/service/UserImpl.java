package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.UserEntity;
import com.test.model.UserAddress;
import com.test.model.UserDetails;
import com.test.respository.UserRepository;
@Service
public class UserImpl implements UserService  {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDetails> saveAddress(UserDetails userDetails) throws Exception {
		
		if(userDetails == null) {
			throw new Exception();
		}
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUserAddress(userDetails.getUserAddress());
		userRepository.save(userEntity);
		List<UserDetails> listUserDetails = new ArrayList<UserDetails>();
		
		return listUserDetails;
	}

}
