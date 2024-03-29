package com.davidchaves.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItenDTO {
    private String productUiid;
    private BigDecimal quantity;

    @Override
    public String toString() {
        return "{productUiid='" + productUiid + "', quantity='" + quantity +"'}";
    }
}
