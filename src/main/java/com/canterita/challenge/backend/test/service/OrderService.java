package com.canterita.challenge.backend.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedFormContentFilter;
import org.springframework.stereotype.Service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.criteria.Order;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.repository.OrderRepository;

@Service
public class OrderService implements IOrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public OrderDto getOrder(Long id) {
		return orderRepository.findById(id)
				.map(order -> new OrderDto(order.getId(), order.getNumber(), order.getClient(), order.getTotal(), order.getDateOrder()))
				.orElse(null);
	}

	public OrderEntity guardarOrden(OrderEntity order){
		return orderRepository.save(order);
	}

	public boolean eliminar(Long id){
		try{
		orderRepository.deleteById(id);
		return true;

		}catch(Exception err){
			return false;
		}
	}

	public ArrayList<OrderEntity>MostrarOrdenes(){
		return (ArrayList<OrderEntity>) orderRepository.findAll();
	}


}
