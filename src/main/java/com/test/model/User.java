package com.test.model;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;
@Data
public class User implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String  firstName;
	
	private String LastName;
	
	private ArrayList<UserAddress> address;
	

}
