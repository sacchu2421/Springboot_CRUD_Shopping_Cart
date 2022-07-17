package com.demo.Shopping_Cart.Exceptions.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.Shopping_Cart.Exceptions.IdIsNotValidException;
import com.demo.Shopping_Cart.Exceptions.NegativeQuantityNotAllowedException;
import com.demo.Shopping_Cart.Exceptions.ProductCannotBeFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(IdIsNotValidException.class)
    public ResponseEntity<Object> handleIdIsNotValidException(IdIsNotValidException idIsNotValidException) {

        List<String> details = new ArrayList<String>();
        details.add(idIsNotValidException.getMessage());

        ApiError response = new ApiError(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "Id Not Found" ,
                LocalDateTime.now(), details);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

}
	
	@ExceptionHandler(NegativeQuantityNotAllowedException.class)
    public ResponseEntity<Object> handleNegativeQuantityNotAllowedException(NegativeQuantityNotAllowedException negativeQuantityNotAllowedException) {

        List<String> details = new ArrayList<String>();
        details.add(negativeQuantityNotAllowedException.getMessage());

        ApiError response = new ApiError(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "Negative Quantity not allowed" ,
                LocalDateTime.now(), details);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

}
	@ExceptionHandler(ProductCannotBeFoundException.class)
    public ResponseEntity<Object> ProductCannotBeFoundException(ProductCannotBeFoundException productCannotBeFoundException) {

        List<String> details = new ArrayList<String>();
        details.add(productCannotBeFoundException.getMessage());

        ApiError response = new ApiError(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, "Product not found" ,
                LocalDateTime.now(), details);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

}
	@ExceptionHandler(com.demo.Shopping_Cart.Exceptions.CartIsEmptyException.class)
    public ResponseEntity<Object> CartIsEmptyException(com.demo.Shopping_Cart.Exceptions.CartIsEmptyException cartIsEmptyException) {

        List<String> details = new ArrayList<String>();
        details.add(cartIsEmptyException.getMessage());

        ApiError response = new ApiError(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, "Product not found" ,
                LocalDateTime.now(), details);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

}
	@ExceptionHandler(com.demo.Shopping_Cart.Exceptions.UserDoesNotExistException.class)
    public ResponseEntity<Object> UserDoesNotExistException(com.demo.Shopping_Cart.Exceptions.UserDoesNotExistException userDoesNotExistException) {

        List<String> details = new ArrayList<String>();
        details.add(userDoesNotExistException.getMessage());

        ApiError response = new ApiError(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "Product not found" ,
                LocalDateTime.now(), details);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

}
	
	
}
