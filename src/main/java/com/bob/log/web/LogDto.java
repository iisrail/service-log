package com.bob.log.web;

import java.io.Serializable;

public class LogDto implements Serializable{
	private static final long serialVersionUID = -8441897817444232696L;
	private Integer size;
		
	public LogDto() {

	}

	@Override
	public String toString() {
		return "LogDto [size=" + size + "]";
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public LogDto(Integer size) {
		this.size = size;
	}	
}
