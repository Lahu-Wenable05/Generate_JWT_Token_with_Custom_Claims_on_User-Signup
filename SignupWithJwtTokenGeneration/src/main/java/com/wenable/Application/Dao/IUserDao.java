package com.wenable.Application.Dao;

import com.wenable.Application.customException.UserException;
import com.wenable.Application.entity.User;

public interface IUserDao {

	public boolean existsByUserName(String userName) throws UserException;

	public User findByUserName(String userName) throws UserException;

	public boolean existsByEmail(String email) throws UserException;
	
	public User save(User user);
}
