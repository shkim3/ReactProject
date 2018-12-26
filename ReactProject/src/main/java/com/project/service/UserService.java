package com.project.service;

import com.project.domain.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
