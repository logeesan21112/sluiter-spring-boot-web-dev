package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.services.OrdersBusinessService;
import com.example.demo.services.OrdersBusinessService2;
import com.example.demo.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {

	@Bean(name = "ordersBusinessService")
	public OrdersBusinessServiceInterface getOrdersBusiness()
	{
		return new OrdersBusinessService2();
	}
}