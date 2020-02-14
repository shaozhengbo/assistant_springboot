package com.shao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shao.dao.UserMapper;
import com.shao.pojo.User;
import com.shao.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.selectByExample(null);
	}

	@Override
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}
}
