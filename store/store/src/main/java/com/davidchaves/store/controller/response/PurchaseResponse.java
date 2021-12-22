package com.davidchaves.store.controller.response;

import lombok.*;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseResponse {
    private String orderUiid;
    private Integer preparationTime;
    private String addressDelivery;
    private LocalDate dateForDelivery;
    private String voucher;
}
