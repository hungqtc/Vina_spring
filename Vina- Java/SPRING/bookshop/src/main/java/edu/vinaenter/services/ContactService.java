package edu.vinaenter.services;

import java.util.List;

import edu.vinaenter.models.Contact;

public interface ContactService {
	
	  List<Contact> findAll();
	
	  int add(Contact contact);
	  
	  int del(int id);
	  
	  
}
