package com.log.logservice.service.Impl;

import com.log.logservice.domain.User;
import com.log.logservice.repo.UserRepository;
import com.log.logservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  liuhuan
 * 用户Service实现类
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	/**
	 *查询所有用户
	 * @return 用户列表
	 */
	@Override
	public List<User> getAll() {

		return userRepository.findAll();
	}
}
