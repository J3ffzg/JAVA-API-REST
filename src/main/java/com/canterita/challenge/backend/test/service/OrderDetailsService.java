package com.canterita.challenge.backend.test.service;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.ArrayList;
import java.util.Optional;

import com.canterita.challenge.backend.test.dto.OrderDetailRequest;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.repository.OrderDetailsRepository;
import com.canterita.challenge.backend.test.repository.OrderRepository;

@Service
public class OrderDetailsService implements IOrderDetailsService{
    @Autowired
	public OrderDetailsRepository orderdetailsRepository;
	public OrderRepository orderRepository;
	public OrderDetailsEntity orderDetailsEntity;
    @Override
	public OrderDetailsDto getOrderDetails(Long idOrder) {
		return orderdetailsRepository.findById(idOrder)
				.map(order -> new OrderDetailsDto(order.getId(), order.getIdOrder(), order.getDetail(), order.getCantidad(), order.getPrecioUnitario(),order.getTotalDetail()))
				.orElse(null);
	}

	public OrderDetailsEntity guardardetalle(OrderDetailRequest order, Long id){
		orderDetailsEntity = new OrderDetailsEntity();
		orderDetailsEntity.setIdOrder(id);
		orderDetailsEntity.setDetail(order.getDetail());
		orderDetailsEntity.setCantidad(order.getCantidad());
		orderDetailsEntity.setPrecioUnitario(order.getPrecioUnitario());
		orderDetailsEntity.setTotalDetail(order.getTotalDetail());
		/* System.out.println(order.getDetail()); */
		return orderdetailsRepository.save(orderDetailsEntity);
	}
	public ArrayList<OrderDetailsEntity>MostrarDetalles(){
		return (ArrayList<OrderDetailsEntity>) orderdetailsRepository.findAll();
	}

	public ArrayList<OrderDetailsEntity> obtenerPorIdOrder(Long id){
		return orderdetailsRepository.findByidOrder(id);
	}
	/* public Optional<OrderEntity> obtenerPorId(Long id){
		orderdetailsRepository.save(orderRepository.obtenerPorId(id));
		return orderRepository.obtenerPorId(id);
	} */
	public boolean eliminar(Long id){
		try{
			orderdetailsRepository.deleteById(id);
		return true;

		}catch(Exception err){
			return false;
		}
	}
}
