package com.shao.controller;

import com.shao.pojo.LoginDto;
import com.shao.pojo.User;
import com.shao.service.LoginService;
import com.shao.service.UserService;
import com.shao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("login")
    public R login(LoginDto loginDto) {
        User loginResult = loginService.login(loginDto);

        if (loginResult != null) {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("data", loginResult);
            resultMap.put("msg", "登陆成功");
            return R.ok(resultMap);
        }

        return R.error("用户名或密码错误");
    }
}
