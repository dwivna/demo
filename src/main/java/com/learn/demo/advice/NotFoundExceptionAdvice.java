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
import com.learn.demo.exception.NotFoundException;

@ControllerAdvice(annotations = RestController.class)
public class NotFoundExceptionAdvice {
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionDTO handleResourceNotFound(final InvalidException exception,
			final HttpServletRequest request) {

		ExceptionDTO error = new ExceptionDTO("Missing Id", 404);
		return error;
	}
}
