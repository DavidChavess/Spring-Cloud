package com.davidchaves.supplier.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SupplierDTO {
    private Integer id;
    private String uiid;
    private String name;
    private String address;
    private String state;
}
