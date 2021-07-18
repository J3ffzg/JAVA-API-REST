package com.canterita.challenge.backend.test.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import com.canterita.challenge.backend.test.dto.OrderDetailRequest;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.model.OrderEntity;

import org.hibernate.annotations.Any;


public interface IOrderDetailsService {
    public OrderDetailsDto getOrderDetails(Long id);
    /* public OrderDetailsEntity guardardetalle(OrderDetailsEntity orden); */
    public ArrayList<OrderDetailsEntity> MostrarDetalles();
    public ArrayList<OrderDetailsEntity> obtenerPorIdOrder(Long id);
    /* public Optional<OrderEntity> obtenerPorId(Long id); */
    public OrderDetailsEntity guardardetalle(OrderDetailRequest orden, Long id);
    
}
