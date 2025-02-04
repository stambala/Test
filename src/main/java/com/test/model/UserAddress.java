package com.test.model;

import java.io.Serializable;

public class UserAddress implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CurrentAddress currentAddress;
	
	private PermanentAddress parmaneteAdress;
	

	public UserAddress(CurrentAddress currentAddress, PermanentAddress parmaneteAdress) {
		this.currentAddress = currentAddress;
		this.parmaneteAdress = parmaneteAdress;
	}

	public CurrentAddress getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(CurrentAddress currentAddress) {
		this.currentAddress = currentAddress;
	}

	public PermanentAddress getParmaneteAdress() {
		return parmaneteAdress;
	}

	public void setParmaneteAdress(PermanentAddress parmaneteAdress) {
		this.parmaneteAdress = parmaneteAdress;
	}
	
	

}
