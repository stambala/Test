package com.test.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String password;
	
	private UserAddress userAddress;

	

}
