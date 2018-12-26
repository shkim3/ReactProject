package com.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.repository.RoleRepository;
import com.project.service.RoleService;

public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public String findRoleById(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findRoleNameById(id);
	}

}
