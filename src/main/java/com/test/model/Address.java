package com.test.model;

import java.io.Serializable;

public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String area;
	
	private String streatName;
	
	private City city;
	
	private Integer zipcode;
	

	public Address(String area, String streatName, City city, Integer zipcode) {
		this.area = area;
		this.streatName = streatName;
		this.city = city;
		this.zipcode = zipcode;
	}

	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreatName() {
		return streatName;
	}

	public void setStreatName(String streatName) {
		this.streatName = streatName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	
	
	
}
