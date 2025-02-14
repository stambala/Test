package com.test.service;

import com.test.exceptiionhandling.BusinessException;
import com.test.exceptiionhandling.ErrorCodes;
import com.test.exceptiionhandling.GlobalExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.UserEntity;
import com.test.model.UserDetails;
import com.test.respository.UserRepository;
@Service
public class UserImpl implements UserService  {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails saveAddress(UserDetails userDetails) throws BusinessException {
		
		if(userDetails.getUserAddress() == null) {
			throw new BusinessException("invalid Request");
		}
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(userDetails.getUserName());
		userEntity.setPassword(userDetails.getPassword());
		userEntity.setUserAddress(userDetails.getUserAddress());
		userRepository.save(userEntity);
		
		return userDetails;
	}

}
