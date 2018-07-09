package com.log.logservice.service;

import com.log.logservice.domain.Log;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liuhuan
 * 日志Service
 */
public interface LogService {

	/**
	 * 插入日志
	 * @param log 日志对象
	 * @return 日志对象
	 */
	Log createLog(Log log);
}
