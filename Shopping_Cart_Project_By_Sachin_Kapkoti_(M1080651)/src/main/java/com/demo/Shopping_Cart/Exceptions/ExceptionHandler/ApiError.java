package com.demo.Shopping_Cart.Exceptions.ExceptionHandler;



import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;



public class ApiError implements Serializable {

    private int statusCode;

    private HttpStatus status;
    private String message;

    public ApiError(int statusCode, HttpStatus status, String message, LocalDateTime timestamp,
			List<String> errorDetails) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.errorDetails = errorDetails;
	}



	public int getStatusCode() {
		return statusCode;
	}



	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}



	public HttpStatus getStatus() {
		return status;
	}



	public void setStatus(HttpStatus status) {
		this.status = status;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public LocalDateTime getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}



	public List<String> getErrorDetails() {
		return errorDetails;
	}



	public void setErrorDetails(List<String> errorDetails) {
		this.errorDetails = errorDetails;
	}



	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private LocalDateTime timestamp;

 

    List<String> errorDetails;
    
    public ApiError() {
    	
    }

}