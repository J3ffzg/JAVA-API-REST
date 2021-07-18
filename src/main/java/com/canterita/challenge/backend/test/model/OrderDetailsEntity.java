package com.canterita.challenge.backend.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity()
@Table(name = "ORDER_DETAILS_ENTITY")
public class OrderDetailsEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "idOrder")
	private Long idOrder;
	
	@Column(name = "detail")
	private String detail;

	@Column(name = "cantidad")
	private Double cantidad;

    @Column(name = "precioUnitario")
	private Double precioUnitario;

    @Column(name = "totalDetail")
	private Double totalDetail;
	
}


