package com.cg.onlinepizza.exceptions;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalPizzaExceptionHandler {
	Logger logger = LoggerFactory.getLogger(GlobalPizzaExceptionHandler.class);

	@ExceptionHandler(PizzaIdNotFoundException.class)
	public ResponseEntity<?>nosuchId(PizzaIdNotFoundException e , WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(), e.getMessage(), request.getDescription(false));
		logger.trace("PizzaIdNotFoundException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidMinCostMaxCostException.class)
	public ResponseEntity<?>noSuchCost(InvalidMinCostMaxCostException e , WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(), e.getMessage(), request.getDescription(false));
		logger.trace("InvalidMinCostMaxCostException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
}
