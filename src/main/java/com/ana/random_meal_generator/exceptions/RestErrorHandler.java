package com.ana.random_meal_generator.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestErrorHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(IntegrationException.class)
	public ResponseEntity<Object> handleIntegrationException(Exception e) {
		String error = "Integration exception";
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		RestError err = new RestError(Instant.now(), status.value(), error, e.getMessage());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAll(Exception e) {
		String error = "Internal server error";
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		RestError err = new RestError(Instant.now(), status.value(), error, e.getMessage());
		return ResponseEntity.status(status).body(err);
	}
}
