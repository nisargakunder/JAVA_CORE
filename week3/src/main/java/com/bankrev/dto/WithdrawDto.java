package com.bankrev.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawDto {
    @NotEmpty(message = "{(id.absent)}")
    private Integer id;
    @NotNull(message = "{(amount.absent)}")
    private BigDecimal amount;
}
