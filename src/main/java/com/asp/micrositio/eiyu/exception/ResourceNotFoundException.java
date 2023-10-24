package com.asp.micrositio.eiyu.exception;

import lombok.Data;

@Data
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Long id;

	public ResourceNotFoundException(Long id) {
		super("Recurso no encontrado: " + id);
		this.id = id;
	}

}
