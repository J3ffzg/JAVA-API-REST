package com.canterita.challenge.backend.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService implements IOrderDetailsService{
    @Autowired
	private OrderDetailsRepository orderdetailsRepository;
    @Override
	public OrderDetailsDto getOrderDetails(Long idOrder) {
		return orderdetailsRepository.findById(idOrder)
				.map(order -> new OrderDetailsDto(order.getId(), order.getIdOrder(), order.getDetail(), order.getCantidad(), order.getPrecioUnitario(),order.getTotalDetail()))
				.orElse(null);
	}

	public OrderDetailsEntity guardardetalle(OrderDetailsEntity order){
		return orderdetailsRepository.save(order);
	}
	public ArrayList<OrderDetailsEntity>MostrarDetalles(){
		return (ArrayList<OrderDetailsEntity>) orderdetailsRepository.findAll();
	}

	public ArrayList<OrderDetailsEntity> obtenerPorIdOrder(Long idOrder){
		return orderdetailsRepository.findByidOrder(idOrder);
	}
	public boolean eliminar(Long id){
		try{
			orderdetailsRepository.deleteById(id);
		return true;

		}catch(Exception err){
			return false;
		}
	}
}
