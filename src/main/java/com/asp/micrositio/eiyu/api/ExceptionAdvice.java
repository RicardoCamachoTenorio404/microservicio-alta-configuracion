package com.asp.micrositio.eiyu.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.asp.micrositio.eiyu.exception.ResourceNotFoundException;

@ControllerAdvice
public class ExceptionAdvice {

	@ResponseBody
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	private ExceptionResponse employeeNotFoundHandler(ResourceNotFoundException ex) {
		return fillExceptionResponse(HttpStatus.NOT_FOUND, ex.getMessage());
	}

	@ResponseBody
	@ExceptionHandler(jakarta.validation.ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	private ExceptionResponse constraintViolationException(jakarta.validation.ConstraintViolationException ex) {
		String[] message = new String[] { "" };
		ex.getConstraintViolations().forEach(cv -> {
			message[0] += !message[0].isEmpty() ? ", " : "";
			message[0] += cv.getMessageTemplate();
		});
		return fillExceptionResponse(HttpStatus.UNPROCESSABLE_ENTITY, message[0]);
	}

	private ExceptionResponse fillExceptionResponse(HttpStatus httpStatus, String message) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setStatus(httpStatus.value());
		exceptionResponse.setStatusMessage(httpStatus.getReasonPhrase());
		exceptionResponse.setMessage(message);
		return exceptionResponse;
	}

}
