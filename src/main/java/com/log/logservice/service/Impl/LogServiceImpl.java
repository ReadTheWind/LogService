package com.log.logservice.service.Impl;

import com.log.logservice.domain.Log;
import com.log.logservice.repo.LogRepository;
import com.log.logservice.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  liuhuan
 * logService实现类
 */
@Service
public class LogServiceImpl implements LogService {

	@Autowired
	LogRepository logRepository;

	/**
	 * 插入日志
	 * @param log 日志对象
	 * @return 日志对象
	 */
	@Override
	public Log createLog(Log log) {
		Log log1=logRepository.save(log);
		return log1;
	}
}
