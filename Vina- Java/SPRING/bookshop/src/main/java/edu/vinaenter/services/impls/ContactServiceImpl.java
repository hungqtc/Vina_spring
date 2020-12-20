package edu.vinaenter.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.daos.ContactDao;
import edu.vinaenter.models.Contact;
import edu.vinaenter.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDao contactDao;

	@Override
	public List<Contact> findAll() {
		return contactDao.findAll();
	}

	@Override
	public int add(Contact contact) {
		return contactDao.addItem(contact);
	}

	@Override
	public int del(int id) {
		return contactDao.delItem(id);
	}

}
