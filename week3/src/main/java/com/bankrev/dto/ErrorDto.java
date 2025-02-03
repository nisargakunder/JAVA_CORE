package com.bankrev.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDto {
    private String errorMessage;
    private String errorCode;
    private String toContact;
    private LocalDateTime timestamp;
}
