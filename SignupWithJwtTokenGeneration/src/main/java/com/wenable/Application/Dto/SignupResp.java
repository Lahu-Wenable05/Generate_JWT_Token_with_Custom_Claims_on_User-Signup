package com.wenable.Application.Dto;

public class SignupResp {

	private String userName;
	private String email;
	private String token;

	public SignupResp() {
		super();
	}

	public SignupResp(String userName, String email, String token) {
		super();
		this.userName = userName;
		this.email = email;
		this.token = token;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "SignupResponseDto [userName=" + userName + ", email=" + email + ", token=" + token + "]";
	}

}
