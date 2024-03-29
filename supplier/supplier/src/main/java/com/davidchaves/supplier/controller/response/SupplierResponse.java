package com.davidchaves.supplier.controller.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SupplierResponse {
    private String uiid;
    private String name;
    private String address;
    private String state;
}
