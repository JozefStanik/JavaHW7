package com.hw7.library;

public class Subscriber {
	private String firstName;
	private String lastName;
	private SubscriberAddress subscriberAddress;
	private String email;
	private int age;
	
	public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriberAddress = subscriberAddress;
		this.email = email;
		this.age = age;
	}
}
