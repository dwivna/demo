package com.learn.demo.exception;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7529813889136021459L;

	public NotFoundException(String message) {
		super(message);
	}
}
