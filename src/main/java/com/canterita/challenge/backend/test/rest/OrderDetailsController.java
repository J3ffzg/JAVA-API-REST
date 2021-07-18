package com.canterita.challenge.backend.test.rest;

import java.io.Console;
import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Optional;

import com.canterita.challenge.backend.test.dto.OrderDetailRequest;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.service.IOrderDetailsService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/orders")
public class OrderDetailsController {
    
    @Autowired
	private IOrderDetailsService orderdetailsService;

    @GetMapping(value = "/{idOrder}/details")
	@ResponseStatus(HttpStatus.OK)
	public ArrayList<OrderDetailsEntity> obtenerPorIdOrder(@PathVariable("idOrder") Long id){
		return this.orderdetailsService.obtenerPorIdOrder(id);
	}
	/* public OrderDetailsDto getOrderDetails(@PathVariable Long idOrder) {
		return orderdetailsService.getOrderDetails(idOrder);
	} */
	@GetMapping(value = "/details")
	public ArrayList<OrderDetailsEntity>MostrarDetalles(){
		return orderdetailsService.MostrarDetalles();
	}

	@PostMapping(value = "/{id}/details")
	public OrderDetailsEntity guardardetalle(@RequestBody OrderDetailRequest orden, @PathVariable("id") Long id){
		return this.orderdetailsService.guardardetalle(orden,id);
	}
	/* public Optional<OrderEntity> obtenerPorId(@PathVariable("id") Long id){
		return this.orderdetailsService.obtenerPorId(id);
	} */

}
