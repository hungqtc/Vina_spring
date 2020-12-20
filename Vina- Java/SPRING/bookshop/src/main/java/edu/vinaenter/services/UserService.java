package edu.vinaenter.services;

import java.util.List;

import edu.vinaenter.models.User;

public interface UserService {
	
	
	  List<User> findAll();
	  
	
	  int add(User user);
	  
	  int del(int id);
	  
	  User getItem(int id);
	  
	  int edit(User user);

	  int hadUser(User user);
}
