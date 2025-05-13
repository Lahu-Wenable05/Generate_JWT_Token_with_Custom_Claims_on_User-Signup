package com.wenable.Application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wenable.Application.customException.UserException;
import com.wenable.Application.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	public boolean existsByUserName(String userName) throws UserException;

	public User findByUserName(String userName) throws UserException;

	public boolean existsByEmail(String email) throws UserException;

}
