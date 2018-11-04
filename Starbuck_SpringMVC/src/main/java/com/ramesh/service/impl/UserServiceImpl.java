package com.ramesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh.domain.User;
import com.ramesh.repository.UserRepository;
import com.ramesh.service.UserService;

 
@Service
 public class UserServiceImpl implements UserService  {
	
	@Autowired 
	UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.getAll();
	}
	
	public User findUser(User name) {
		return userRepository.findByName(name.getUserName());
	}
	
	
		   
}
 
