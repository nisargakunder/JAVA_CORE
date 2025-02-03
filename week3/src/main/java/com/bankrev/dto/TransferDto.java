package com.bankrev.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferDto {
    @NotNull(message = "{id.absent}")
    private Integer FromId;
    @NotNull(message = "{id.absent}")
    private Integer ToId;
    @NotNull(message = "{amount.absent}")
    @Range(message = "{amount.range}", min = 0,max=1000000)
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getFromId() {
        return FromId;
    }

    public void setFromId(int fromId) {
        FromId = fromId;
    }

    public int getToId() {
        return ToId;
    }

    public void setToId(int toId) {
        ToId = toId;
    }
}
