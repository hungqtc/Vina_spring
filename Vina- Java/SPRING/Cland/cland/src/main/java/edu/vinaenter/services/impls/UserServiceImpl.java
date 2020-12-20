package edu.vinaenter.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.daos.UserDao;
import edu.vinaenter.models.User;
import edu.vinaenter.services.UserService;
import edu.vinaenter.utils.StringUtil;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

	@Override
	public int add(User user) {
		user.setPassword(StringUtil.md5(user.getPassword()));
		return userDao.addItem(user); 
	}

	@Override
	public int del(int id) {
		return userDao.delItem(id);
	}

	@Override
	public User getItem(int id) {
		return userDao.getItem(id);
	}

	@Override
	public int edit(User user) {
		
		
		if ("".equals(user.getPassword())) {
			User oldUser = userDao.getItem(user.getId());
			user.setPassword(oldUser.getPassword());
		} else {
			user.setPassword(StringUtil.md5(user.getPassword()));
		}
		
		return userDao.editItem(user);
	}

	@Override
	public int hadUser(User user) {
		return userDao.hadUser(user.getUsername());
	}


}
