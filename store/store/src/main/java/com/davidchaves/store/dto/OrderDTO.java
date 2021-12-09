package com.davidchaves.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Set<ItenDTO> itens;
    private AddressDTO address;
}
