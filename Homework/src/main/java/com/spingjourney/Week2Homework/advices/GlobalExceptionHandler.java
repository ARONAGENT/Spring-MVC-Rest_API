package com.spingjourney.Week2Homework.advices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ApiResponse<?>> noSuchElement(NoSuchElementException exception){
        ApiError apiError=ApiError
                .builder()
                .status(HttpStatus.NOT_FOUND)
                .message("Resource Not Found By Id")
                .build();
        return buildErrorResponseEntity(apiError);

    }

    private ResponseEntity<ApiResponse<?>> buildErrorResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(new ApiResponse<>(apiError),apiError.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> internalServerError(Exception exception){
        ApiError apiError=ApiError
                .builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(exception.getMessage())
                .build();
        return buildErrorResponseEntity(apiError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<?>> validationError(MethodArgumentNotValidException exception){
        List<String> errors= exception
                .getBindingResult()
                .getAllErrors()
                .stream()
                .map(error ->error.getDefaultMessage() )
                .collect(Collectors.toList());
        ApiError apiError=ApiError
                .builder()
                .status(HttpStatus.BAD_REQUEST)
                .message("Input Validation Error")
                .subErrors(errors)
                .build();
        return buildErrorResponseEntity(apiError);
    }
}
