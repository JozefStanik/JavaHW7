package com.hw7.library;

public class SubscriberAddress {
	private String streetName;
	private int streetNumber;
	private String city;
	private String country;
	private int zipCode;
	private int age;
	
	public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode) {
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode, int age) {
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
		this.age = age;
	}
}
