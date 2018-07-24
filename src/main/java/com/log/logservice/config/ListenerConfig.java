package com.log.logservice.config;

import com.log.logservice.listener.LogListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 监听器的配置类，也可用@WebListener注解代替
 * @author liuhuan1
 */
//@Configuration
public class ListenerConfig {

	@Bean
	public ServletListenerRegistrationBean servletListenerRegistrationBean() {
		ServletListenerRegistrationBean slrBean = new ServletListenerRegistrationBean();
		slrBean.setListener(new LogListener());
		return slrBean;
	}

	}
