package com.example.mindmrp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mindmrp.model.Role;
import com.example.mindmrp.repository.RoleRepository;
import com.example.mindmrp.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Optional<Role> findByRole(String role) {
		return roleRepository.findByRole(role);
	}

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}

}
