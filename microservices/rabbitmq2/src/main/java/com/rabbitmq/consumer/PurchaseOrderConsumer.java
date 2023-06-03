package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


import com.rabbitmq.model.OrderStatus;



@Component
public class PurchaseOrderConsumer {

	
	//is like groupp(queue)
	//this is listener
	//when 
	
	@RabbitListener(queues="ust_queue")
	public void consumeMeaageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("Message recived from queue: " + orderStatus);
	}
	
}