package com.canterita.challenge.backend.test.repository;

import java.util.ArrayList;
import java.util.Optional;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.model.OrderEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Long> {
    public abstract ArrayList<OrderDetailsEntity> findByidOrder(Long id);
    public abstract void save(Optional<OrderDetailsEntity> optional);
    /* public abstract void saveAll(Optional<OrderDetailsEntity> obtenerPorId); */
   /*  public abstract void setIdOrder(Long id); */
}
