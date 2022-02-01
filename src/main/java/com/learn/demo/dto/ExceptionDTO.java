package com.learn.demo.dto;

public class ExceptionDTO {

	private String error;
	private Integer status;

	public ExceptionDTO(String error, Integer status) {
		super();
		this.error = error;
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
