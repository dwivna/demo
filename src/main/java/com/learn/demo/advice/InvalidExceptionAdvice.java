package com.learn.demo.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.learn.demo.dto.ExceptionDTO;
import com.learn.demo.exception.InvalidException;

@ControllerAdvice(annotations = RestController.class)
public class InvalidExceptionAdvice {
	@ExceptionHandler(InvalidException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionDTO handleInvalidIdException(final InvalidException exception,
			final HttpServletRequest request) {

		ExceptionDTO error = new ExceptionDTO("Invalid Id", 500);
		return error;
	}
}
