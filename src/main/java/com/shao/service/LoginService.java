package com.shao.service;

import com.shao.pojo.LoginDto;
import com.shao.pojo.User;
import org.springframework.stereotype.Service;

public interface LoginService {

    public User login(LoginDto loginDto);
}
