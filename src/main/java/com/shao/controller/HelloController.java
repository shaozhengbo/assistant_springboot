package com.shao.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shao.utils.DateUtil;
import com.shao.utils.R;

@RestController
public class HelloController {

	@GetMapping("hello")
	public R hello() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("msg", DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		resultMap.put("datetime", DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		return R.ok(resultMap);
	}
}
