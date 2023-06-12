package com.example.mindmrp.service;

import java.util.Optional;

import com.example.mindmrp.model.Role;

public interface RoleService {
	
	Optional<Role> findByRole(String role);
	
	Role save(Role role);

}
