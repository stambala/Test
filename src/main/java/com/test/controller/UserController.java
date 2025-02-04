package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.UserAddress;
import com.test.model.UserDetails;
import com.test.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/address")
	public ResponseEntity<List<UserDetails>> saveAdderss(@RequestBody UserDetails userAddress) throws Exception {
		
		
		List<UserDetails> listUserDetails = userService.saveAddress(userAddress);
		
		return new ResponseEntity<>(listUserDetails, HttpStatus.CREATED);
	
	}

}
