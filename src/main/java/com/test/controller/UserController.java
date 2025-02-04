package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/adderss")
	public ResponseEntity<List<UserAddress>> saveAdderss() {
		
	}

}
