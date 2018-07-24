package com.log.logservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author liuhuan
 * 日志服务启动类
 */
@SpringBootApplication
@ServletComponentScan
public class LogserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogserviceApplication.class, args);
	}
}
