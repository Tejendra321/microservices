package com.magic.user.service.services;

import java.util.List;

import com.magic.user.service.entites.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);

}
