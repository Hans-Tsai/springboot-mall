package com.example.springbootmall.service;

import com.example.springbootmall.model.Order;
import com.example.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}