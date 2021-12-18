package com.davidchaves.supplier.controller.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemResponse {
    private String uiid;
    private BigDecimal quantity;
    private BigDecimal total;
    private ProductResponse product;

    @Override
    public String toString() {
        return "{" +
                "uiid='" + uiid + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                ", product=" + product +
                '}';
    }
}
