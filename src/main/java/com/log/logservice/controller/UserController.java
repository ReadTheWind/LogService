package com.log.logservice.controller;

import com.log.logservice.domain.User;
import com.log.logservice.service.UserService;
import com.log.logservice.util.MainAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author liuhuan
 * 用户controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 查询所有用户信息
	 * @return
	 */
	@MainAnnotation(desc = "查询所有操作",maintype = 1,tables = "user",type = "get")
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
	public List<User> getAll(){
		return userService.getAll();
	}

	/**
	 * 查询所有用户信息
	 * @return
	 */
	@MainAnnotation(desc = "创建用户对象",maintype = 2,tables = "user",type = "post")
	@RequestMapping(value = "/create",method = RequestMethod.GET)
	public List<User> create(){
		return userService.getAll();
	}
}
