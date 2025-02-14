package com.test.controller;

import java.util.List;

import com.test.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.model.UserAddress;
import com.test.model.UserDetails;
import com.test.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("productImpl")
	private UserService userService;

	@Autowired
	private BalanceService service;
	
	@PostMapping("/address")
	public ResponseEntity<UserDetails> saveAdderss(@RequestBody UserDetails userAddress) throws Exception {
		
		
		UserDetails listUserDetails = userService.saveAddress(userAddress);
		
		return new ResponseEntity<>(listUserDetails, HttpStatus.CREATED);
	
	}

	@GetMapping("/balance/{accountNumber}")
	public ResponseEntity<Double> checkBalance(@PathVariable String accountNumber) {
		Double baalance = service.checkBalance(accountNumber);
		return new ResponseEntity<>(baalance,HttpStatus.ACCEPTED);
	}

}
