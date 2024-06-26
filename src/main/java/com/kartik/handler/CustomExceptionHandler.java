package com.kartik.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kartik.exception.CompanyNotFoundException;
import com.kartik.payload.response.ErrorMessage;

@RestControllerAdvice
public class CustomExceptionHandler {
     
	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleCompanyNotFoundException(
			CompanyNotFoundException cnfe)
	{
		return ResponseEntity.internalServerError().body(
			new ErrorMessage(new Date().toString(),
					cnfe.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR.value(),
					HttpStatus.INTERNAL_SERVER_ERROR.name()
)
				
				);
	}
}
