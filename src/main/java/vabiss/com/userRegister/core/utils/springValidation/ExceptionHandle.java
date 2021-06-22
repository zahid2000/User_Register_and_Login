package vabiss.com.userRegister.core.utils.springValidation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import vabiss.com.userRegister.core.utils.results.ErrorResult;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationExceptions(MethodArgumentNotValidException ex) {
        return new ResponseEntity<>(new ErrorResult(ex.getBindingResult().getFieldError().getDefaultMessage()),
                HttpStatus.NOT_ACCEPTABLE);
    }}
