package com.canterita.challenge.backend.test.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class OrderDetailRequest {

	private String detail;
	
	private Double cantidad;

	private Double precioUnitario;

	private Double totalDetail;
}
