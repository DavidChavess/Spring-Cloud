package com.davidchaves.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String supplierUiid;
    private AddressDTO address;
    private Set<ItenDTO> itens;

    @Override
    public String toString() {
        return "{address='"+ address + "', itens='" + itens + "'}";
    }
}
