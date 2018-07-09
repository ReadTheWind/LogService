package com.log.logservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置
 * @author  liuhuan
 */
@Configuration
public class RabbitConfig {

	/**
	 * 定义队列名
	 */
	public static final String DEFAULT_BOOK_QUEUE = "dev.book.register.default.log.queue";
	public static final String MANUAL_BOOK_QUEUE = "dev.book.register.manual.queue";

	/**
	 * 创建队列对象
	 * @return
	 */
	@Bean
	public Queue defaultBookQueue(){
		// 第一个是 QUEUE 的名字,第二个是消息是否需要持久化处理
		return  new Queue(DEFAULT_BOOK_QUEUE,true);
	}


	@Bean
	public Queue manualBookQueue() {
		// 第一个是 QUEUE 的名字,第二个是消息是否需要持久化处理
		return new Queue(MANUAL_BOOK_QUEUE, true);
	}
}
