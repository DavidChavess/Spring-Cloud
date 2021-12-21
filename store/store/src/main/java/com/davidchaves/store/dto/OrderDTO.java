package com.davidchaves.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String supplierUiid;
    private AddressDTO addressDTO;
    private Set<ItenDTO> itens;

    @Override
    public String toString() {
        return "{supplierUiid='" + supplierUiid + "', itens='" + itens + "'}";
    }
}
