package com.demo.bean;

public class Address {
	// data Memebers of the Addrees Classs
	private String street;
	private String city;
	private String pincode;
	
	// default constructor 
	public Address() {
		super();
	}

	// default constructor 
	public Address(String street, String city, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	// getters and Setters 
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	// toString Method 
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
		
	
}
