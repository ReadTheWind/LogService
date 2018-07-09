package com.log.logservice.repo;

import com.log.logservice.domain.Log;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuhuan
 * 日志Repo
 */
public interface LogRepository extends JpaRepository<Log,Long>{ }
