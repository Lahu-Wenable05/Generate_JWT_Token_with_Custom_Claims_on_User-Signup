package com.wenable.Application.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wenable.Application.Dto.ErrorResponseDto;
import com.wenable.Application.customException.UserException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class) 
	public ResponseEntity<Object> handleUserException(UserException ex) {
		return new ResponseEntity<>(new ErrorResponseDto(false, ex.getMessage()), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex) {
		return new ResponseEntity<>(new ErrorResponseDto(false, ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
