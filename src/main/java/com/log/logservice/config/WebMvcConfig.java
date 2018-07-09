package com.log.logservice.config;

import com.log.logservice.util.MainInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author liuhuan
 */
@SpringBootConfiguration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * 自定义请求拦截器
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new MainInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}
