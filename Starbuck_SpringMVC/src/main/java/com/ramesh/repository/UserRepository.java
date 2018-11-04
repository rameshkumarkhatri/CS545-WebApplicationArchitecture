package com.ramesh.repository;

import java.util.List;

import com.ramesh.domain.User;

 public interface UserRepository   {
	
	public List<User> getAll();
	
	public User findByName(String name);
	
	
		   
}
 
