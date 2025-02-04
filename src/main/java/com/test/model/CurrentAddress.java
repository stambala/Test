package com.test.model;

import java.io.Serializable;

public class CurrentAddress extends Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nearMe;
	
	private String mobileNumber;

	public CurrentAddress(String area, String streatName, City city, Integer zipcode, String nearMe,
			String mobileNumber) {
		super(area, streatName, city, zipcode);
		this.nearMe = nearMe;
		this.mobileNumber = mobileNumber;
	}

	public String getNearMe() {
		return nearMe;
	}

	public void setNearMe(String nearMe) {
		this.nearMe = nearMe;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

	

}
