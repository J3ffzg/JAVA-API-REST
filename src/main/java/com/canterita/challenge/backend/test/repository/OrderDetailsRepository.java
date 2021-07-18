package com.canterita.challenge.backend.test.repository;

import java.util.ArrayList;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Long> {
    public abstract ArrayList<OrderDetailsEntity> findByidOrder(Long idOrder);
}
