package com.log.logservice.util;

import com.log.logservice.domain.Log;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;

/**
 * @author liuhuan
 * 请求拦截器
 */
public class MainInterceptor implements HandlerInterceptor {



	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

		HandlerMethod method = (HandlerMethod) handler;
		MainAnnotation mainAnnotation=method.getMethodAnnotation(MainAnnotation.class);
		if(mainAnnotation != null){
			String description=mainAnnotation.desc();
			int maintype=mainAnnotation.maintype();
			String tables=mainAnnotation.tables();
			String type=mainAnnotation.type();
			String username="guest";
			Date casetime=new Date(118,1,1);
			LogUtil.writeMainLog(new Log(description,maintype,tables,type,username,casetime));
		}

	}
}
