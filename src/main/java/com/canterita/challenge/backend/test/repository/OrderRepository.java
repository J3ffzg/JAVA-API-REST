package com.canterita.challenge.backend.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import com.canterita.challenge.backend.test.model.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    public abstract ArrayList<OrderEntity> findById(Integer id);
}
