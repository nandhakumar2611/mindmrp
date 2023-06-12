package com.example.mindmrp.service;

import com.example.mindmrp.model.User;

public interface UserService {
	
	Boolean existsByEmail(String email);
	
	User save(User user);

}
