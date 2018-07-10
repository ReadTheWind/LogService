package com.log.logservice.util;

import com.log.logservice.config.RabbitConfig;
import com.log.logservice.domain.Log;
import com.log.logservice.service.LogService;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 队列消费者
 * @author  liuhuan
 */
@Component
public class LogHandler {
	@Autowired
	LogService logService;

	/**
	 * 队列消费者
	 * 监听队列
	 * @param log
	 * @param message
	 * @param channel
	 */
	@RabbitListener(queues = {RabbitConfig.DEFAULT_BOOK_QUEUE})
	public void listenerAutoAck(Log log, Message message, Channel channel) {
		// TODO 如果手动ACK,消息会被监听消费,但是消息在队列中依旧存在,如果 未配置 acknowledge-mode 默认是会在消费完毕后自动ACK掉
		final long deliveryTag = message.getMessageProperties().getDeliveryTag();
		try {
			Thread.sleep(3000);
			System.out.println("-------------***************************************************-----------");
			//数据库插入日志对象
			Log rlog=logService.createLog(log);
			if(rlog != null){
				System.out.println("------------- "+RabbitConfig.DEFAULT_BOOK_QUEUE+"MQ消费成功:"+rlog.getUsername()+" -----------");
				// TODO 通知 MQ 消息已被成功消费,可以ACK了
				channel.basicAck(deliveryTag, false);
			}else{
				System.out.println("-------------   MQ消费失败:"+rlog+" -----------");
				//处理失败,重新压入MQ
				channel.basicRecover();
			}
		} catch (IOException e) {
			try {
				// TODO 处理失败,重新压入MQ
				channel.basicRecover();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	@RabbitListener(queues = {RabbitConfig.MANUAL_BOOK_QUEUE})
	public void listenerManualAck(Log log, Message message, Channel channel) {
//		log.info("[listenerManualAck 监听的消息] - [{}]", book.toString());
		System.out.println("-------------***************************************************-----------");
		System.out.println("-------------   MQ消费完成:"+log.getUsername()+" -----------");
		try {
			// TODO 通知 MQ 消息已被成功消费,可以ACK了
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		} catch (IOException e) {
			// TODO 如果报错了,那么我们可以进行容错处理,比如转移当前消息进入其它队列
		}
	}
}
