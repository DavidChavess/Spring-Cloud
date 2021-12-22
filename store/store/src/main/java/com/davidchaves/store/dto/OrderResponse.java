package com.davidchaves.store.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderResponse {
    private String uiid;
    private String status;
    private Integer preparationTime;
    private BigDecimal total;
}
