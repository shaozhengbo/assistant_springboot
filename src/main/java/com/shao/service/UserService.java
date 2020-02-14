package com.shao.service;

import java.util.List;

import com.shao.pojo.User;

public interface UserService {
	public List<User> findAll();

	public User findByUsername(String username);
}
