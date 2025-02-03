package com.bankrev.controller;

import com.bankrev.dto.ErrorDto;
import com.bankrev.exceptions.AccountNotFound;
import com.bankrev.exceptions.NotEnoughFundsException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class BankAppExceptionHandler {
    @ExceptionHandler(AccountNotFound.class)
public ResponseEntity <ErrorDto> handleError(AccountNotFound ex ){
    ErrorDto Errorresponse=ErrorDto.builder()
            .errorMessage(ex.getMessage())
            .errorCode("404")
            .toContact("support")
            .timestamp(LocalDateTime.now())
            .build();
    return  ResponseEntity.status(404).body(Errorresponse);

}
@ExceptionHandler(NotEnoughFundsException.class)
public ResponseEntity <ErrorDto> handleErrorNoMoney(NotEnoughFundsException ex ){
    ErrorDto Errorresponse=ErrorDto.builder()
            .errorMessage(ex.getMessage())
            .errorCode("404")
            .toContact("support")
            .timestamp(LocalDateTime.now())
            .build();
    return  ResponseEntity.status(404).body(Errorresponse);

}
@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDto> heandle400(MethodArgumentNotValidException ex){
        String message=ex.getBindingResult().getAllErrors().stream().map(error->error.getDefaultMessage()).collect(Collectors.joining(","));
    ErrorDto Errorresponse=ErrorDto.builder()
            .errorMessage(message)
            .errorCode("400")
            .toContact("support")
            .timestamp(LocalDateTime.now())
            .build();
    return  ResponseEntity.status(HttpStatusCode.valueOf(400)).body(Errorresponse);

    }

}
