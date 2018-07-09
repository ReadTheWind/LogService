package com.log.logservice.util;

import com.log.logservice.config.RabbitConfig;
import com.log.logservice.domain.Log;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogUtil {

	static  RabbitTemplate rabbitTemplate;
	@Autowired
	public  LogUtil(RabbitTemplate rabbitTemplate){
		LogUtil.rabbitTemplate=rabbitTemplate;
	}

	public  static  void  writeMainLog(Log log){

		System.out.println("-------------***************************************************-----------");
		System.out.println("-------------   数据库日志MQ通知开始:"+log.getUsername()+" -----------");
		rabbitTemplate.convertAndSend(RabbitConfig.DEFAULT_BOOK_QUEUE,log);
		System.out.println("-------------   数据库日志MQ通知完成:"+log.getUsername()+" -----------");
		System.out.println("-------------***************************************************-----------");


	}

}
