package com.team.Imitation.repository;

public class Member {

	private String name;
	private String passwrod;
	private String email;
	private String phoneNumber;
	private String address;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String passwrod, String email, String phoneNumber, String address) {
		super();
		this.name = name;
		this.passwrod = passwrod;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
