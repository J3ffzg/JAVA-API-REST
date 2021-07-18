package com.canterita.challenge.backend.test.service;

import java.util.ArrayList;
import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;


public interface IOrderDetailsService {
    public OrderDetailsDto getOrderDetails(Long id);
    public ArrayList<OrderDetailsEntity> showDetails();
    public ArrayList<OrderDetailsEntity> getByIdOrder(Long id);
    public OrderDetailsEntity saveDetails(OrderDetailsDto orderDetail, Long id);
    public boolean delete(Long id);
    
}
