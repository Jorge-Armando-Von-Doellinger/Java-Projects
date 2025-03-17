package com.dio_study_documentation.project_documented.handler;


import com.dio_study_documentation.project_documented.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    private ResponseEntity<String> testException(BusinessException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("test - success! ");
    }
}
