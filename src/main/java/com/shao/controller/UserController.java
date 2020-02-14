package com.shao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shao.service.UserService;
import com.shao.utils.R;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("user")
	public R createUser() {
		return R.ok().put("data", userService.findAll());
	}
}
