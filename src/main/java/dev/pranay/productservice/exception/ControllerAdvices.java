package dev.pranay.productservice.exception;

import dev.pranay.productservice.dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvices {

//    @ExceptionHandler(NotFoundException.class)
//    private ResponseEntity<ExceptionDto> handleNotfoundException(NotFoundException notFoundException){
//        return  new ResponseEntity<>
//                (new ExceptionDto(HttpStatus.NOT_FOUND, notFoundException.getMessage()),
//                        HttpStatus.NOT_FOUND);
//    }
}
