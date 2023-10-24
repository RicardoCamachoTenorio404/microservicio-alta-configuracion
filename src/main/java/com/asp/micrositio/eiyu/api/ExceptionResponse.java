package com.asp.micrositio.eiyu.api;

import lombok.Data;

@Data
public class ExceptionResponse {

	private int status;
	private String statusMessage;
	private String message;

}
