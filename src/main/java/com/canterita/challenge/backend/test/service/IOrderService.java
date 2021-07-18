package com.canterita.challenge.backend.test.service;

import java.util.ArrayList;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;

import org.springframework.boot.web.servlet.filter.OrderedFormContentFilter;

public interface IOrderService {
	
	public OrderDto getOrder(Long id);
	public OrderEntity guardarOrden(OrderEntity orden);
	public boolean eliminar(Long id);
	public ArrayList<OrderEntity> MostrarOrdenes();

}
