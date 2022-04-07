package com.springrest.sptingrest.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.sptingrest.dao.UserDao;
import com.springrest.sptingrest.entities.Users;

@Service
public class UserServicesImpl implements UserServices {

	// List<Users> list;
	
	@Autowired
	private UserDao userDao;

	public UserServicesImpl() {
		/*
		 * list = new ArrayList<>(); list.add(new
		 * Users(1,"Prabal","developer","read/write","apple")); list.add(new
		 * Users(2,"Pratap","reader","read","pratap"));
		 */
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	
	@Override
	public Users userLogin(long userId) {
		
		return userDao.getById(userId);
	}


	@Override
	public Users registerUser(Users user) {
		// list.add(user);
		userDao.save(user);
		return user;
	}

	@Override
	public Users updateUser(Users user) {

		/*
		 * list.forEach(e-> { if(e.getId()==user.getId()) {
		 * e.setUsername(user.getUsername()); e.setPermission(user.getPermission());
		 * e.setRole(user.getRole()); e.setPassword(user.getPassword()); } });
		 */
		
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(long userId) {

		/*
		 * Users u = null;
		 * 
		 * for(Users user:list) { if(user.getUsername().matches(username) &&
		 * user.getPassword().matches(password)) { u = user; break; } }
		 * 
		 * list.remove(u);
		 */
		Users entity = userDao.getById(userId);
		userDao.delete(entity);
	}



}
