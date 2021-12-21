package com.davidchaves.supplier.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequest {
    private String supplierUiid;
    private AddressRequest address;
    private Set<OrderItemRequest> itens = new HashSet<>();

    @Override
    public String toString() {
        return "{supplierUiid='" + supplierUiid + "', address='" + address + "', itens='" + itens + "'}";
    }
}

