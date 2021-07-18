package com.canterita.challenge.backend.test.service;

import java.util.ArrayList;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;


public interface IOrderDetailsService {
    public OrderDetailsDto getOrderDetails(Long idOrder);
    public OrderDetailsEntity guardardetalle(OrderDetailsEntity orden);
    public ArrayList<OrderDetailsEntity> MostrarDetalles();
    public ArrayList<OrderDetailsEntity> obtenerPorIdOrder(Long idOrder);

}
