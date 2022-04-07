package com.springrest.sptingrest.services;


import java.util.List;

import com.springrest.sptingrest.entities.Users;

public interface UserServices {
	public List<Users> getUsers();
	
	public Users userLogin(long userId);
	
	public Users registerUser(Users user);
	
	public Users updateUser(Users user);
	
	public void deleteUser(long userId);


}
