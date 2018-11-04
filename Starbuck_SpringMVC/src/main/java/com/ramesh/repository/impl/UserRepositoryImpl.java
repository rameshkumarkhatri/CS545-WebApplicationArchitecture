package com.ramesh.repository.impl;

import java.util.List;

import com.ramesh.data.Database;
import com.ramesh.domain.User;
import com.ramesh.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 
@Repository
 public class UserRepositoryImpl implements UserRepository {

	@Autowired
	Database data;
 
	@Override
	public List<User> getAll() {
		return (List<User>) data.users.values();
	}
	
 
	@Override
	public User findByName(String name) {
		User user = data.users.get(name);
		
		return user;
	}
	
	
		   
}
 
