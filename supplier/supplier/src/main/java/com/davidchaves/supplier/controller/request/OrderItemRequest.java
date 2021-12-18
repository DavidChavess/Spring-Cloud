package com.davidchaves.supplier.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderItemRequest {
    private String productUiid;
    private BigDecimal quantity;

    @Override
    public String toString() {
        return "{productUiid='" + productUiid + "', quantity='" + quantity +"'}";
    }
}
