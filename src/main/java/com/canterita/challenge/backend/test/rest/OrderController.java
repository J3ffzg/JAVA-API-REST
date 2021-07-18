package com.canterita.challenge.backend.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.service.IOrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public OrderDto getOrder(@PathVariable Long id) {
		return orderService.getOrder(id);
	}

	@GetMapping()
	public ArrayList<OrderEntity>MostrarOrdenes(){
		return orderService.MostrarOrdenes();
	}

	@PostMapping()
	public OrderEntity guardarOrden(@RequestBody OrderEntity orden){
		return this.orderService.guardarOrden(orden);
	}

	@DeleteMapping(value = "/{id}")
	public String eliminar(@PathVariable("id") Long id){
		boolean ok = this.orderService.eliminar(id);
		if (ok){
			return "Orden eliminada";
		}else {
			return "No se pudo eliminar la orden con id "+id;
		}
	}

	

}
