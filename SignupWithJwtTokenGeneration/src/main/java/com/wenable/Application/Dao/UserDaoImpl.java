package com.wenable.Application.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wenable.Application.customException.UserException;
import com.wenable.Application.entity.User;
import com.wenable.Application.repository.UserRepository;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private UserRepository userRepo;

	@Override
	public boolean existsByUserName(String userName) throws UserException {

		if (userRepo.existsByUserName(userName)) {
			throw new UserException("User Already Exists.. try again..");
		}
		return true;
	}

	@Override
	public User findByUserName(String userName) throws UserException {
		User user = userRepo.findByUserName(userName);
		if (user == null) {
			throw new UserException("User Not Foun..");
		} else {
			return user;
		}
	}

	@Override
	public boolean existsByEmail(String email) throws UserException {

		if (userRepo.existsByEmail(email)) {
			throw new UserException("Email already exists.. try with another email..");
		}
		return true;
	}

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

}
