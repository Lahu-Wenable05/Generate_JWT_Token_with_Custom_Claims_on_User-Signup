package com.wenable.Application.Dto;

public class SignupRequestDto {

	private String userName;
	private String email;
	private String password;
	private String firstName;
	private String lastName; 
	private Long phoneNumber;

	public SignupRequestDto() {
		super();
	}

	public SignupRequestDto(String userName, String email, String password, String firstName, String lastName,
			Long phoneNumber) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFistName() {
		return firstName; 
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber; 
	}

	@Override
	public String toString() {
		return "SignupRequestDto [userName=" + userName + ", email=" + email + ", password=" + password + ", fistName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
	}

}
