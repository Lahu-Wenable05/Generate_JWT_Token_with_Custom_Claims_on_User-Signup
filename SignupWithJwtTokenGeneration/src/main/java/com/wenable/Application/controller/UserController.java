package com.wenable.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenable.Application.Dto.SignupRequestDto;
import com.wenable.Application.Dto.SignupResp;
import com.wenable.Application.JwtTokenUtil.JwtTokenUtil;
import com.wenable.Application.Service.UserService;
import com.wenable.Application.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private JwtTokenUtil generateToken;

	@PostMapping("/signup")
	public SignupResp signup(@RequestBody SignupRequestDto signupRequesDto) {

		User user = userService.signup(signupRequesDto);

		String token = generateToken.generateToken(user.getUserName());

		SignupResp signupsuccess = new SignupResp();
		signupsuccess.setUserName(user.getUserName());
		signupsuccess.setEmail(user.getEmail());
		signupsuccess.setToken(token);

		return signupsuccess;

	}

}
