package com.log.logservice.service;

import com.log.logservice.domain.User;

import java.util.List;

/**
 *
 */
public interface UserService {

	/**\
	 * 查询所有
	 * @return
	 */
	public List<User> getAll();

}
