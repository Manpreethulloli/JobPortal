package com.example.JobPortal.exception;

public class InvalidRecruiterException extends RuntimeException {
	
	String msg;
	 
	public InvalidRecruiterException(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
