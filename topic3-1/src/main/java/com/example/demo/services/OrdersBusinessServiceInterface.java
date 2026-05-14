package com.example.demo.services;

import java.util.List;

import com.example.demo.models.OrderModel;

public interface OrdersBusinessServiceInterface {

	public void test();

	public List<OrderModel> getOrders();

	// future methods
	// searchOrders(String searchTerm)
	// addOrder(OrderModel newO)
	// deleteOrder(Long id)
	// updateOrder(OrderModel updateMe)
	// getOneOrder(Long id)
}