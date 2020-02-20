package com.shao.service.impl;

import com.shao.dao.UserMapper;
import com.shao.pojo.LoginDto;
import com.shao.pojo.User;
import com.shao.service.LoginService;
import com.shao.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(LoginDto loginDto) {
        User userFromDb = userMapper.findByUsername(loginDto.getUsername());

        if (userFromDb != null && userFromDb.getPassword().equals(MD5Util.md5(loginDto.getPassword()))) {
            return userFromDb;
        }
        return null;
    }
}
