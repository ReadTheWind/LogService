package com.log.logservice.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.Enumeration;

/**
 * 自定义监听器
 * @author liuhuan
 */
@WebListener
public class LogListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

	}

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		String ServerName=servletRequestEvent.getServletRequest().getServerName();
		Enumeration<String> AttributeNames=servletRequestEvent.getServletRequest().getAttributeNames();
		while(true){
			if(AttributeNames.hasMoreElements()){
				AttributeNames.nextElement();
				System.out.println("*************自定义监听器logListener****************************************"+ServerName+";"+AttributeNames.nextElement());
			}else{
				System.out.println("*************自定义监听器logListener****************************************"+ServerName);
				return;
			}
		}
	}
}
