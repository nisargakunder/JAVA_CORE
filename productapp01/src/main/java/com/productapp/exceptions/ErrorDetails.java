package com.productapp.exceptions;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository

public class ErrorDetails {
    private String message;
    private String details;
    private LocalDateTime time;
}
