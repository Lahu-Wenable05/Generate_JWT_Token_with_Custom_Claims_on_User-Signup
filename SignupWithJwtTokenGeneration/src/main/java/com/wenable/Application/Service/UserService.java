package com.wenable.Application.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenable.Application.Dao.IUserDao;
import com.wenable.Application.Dto.SignupRequestDto;
import com.wenable.Application.Validations.Validations;
import com.wenable.Application.entity.User;

@Service
public class UserService {

	@Autowired
	private Validations validation;

	@Autowired
	private IUserDao userDao;

	public User signup(SignupRequestDto signupRequestDto) {

		validation.isValidEmail(signupRequestDto.getEmail());
		validation.isValidPassword(signupRequestDto.getPassword());
		userDao.existsByEmail(signupRequestDto.getEmail());

		User user = new User();
		user.setUserName(signupRequestDto.getUserName());
		user.setEmail(signupRequestDto.getEmail());
		user.setPassword(signupRequestDto.getPassword());
		user.setFistName(signupRequestDto.getFistName());
		user.setLastName(signupRequestDto.getLastName());
		user.setPhoneNumber(signupRequestDto.getPhoneNumber());

		return userDao.save(user);

	}
}
