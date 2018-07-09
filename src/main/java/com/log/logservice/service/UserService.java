package com.log.logservice.service;

import com.log.logservice.domain.User;

import java.util.List;

/**
 *@author  liuhuan
 * 用户service接口
 */
public interface UserService {

	/**
	 *查询所有用户
	 * @return 用户列表
	 */
	public List<User> getAll();

}
