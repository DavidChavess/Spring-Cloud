package com.davidchaves.supplier.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {
    private String street;
    private String city;
    private String district;
    private String number;
    private String state;

    @Override
    public String toString(){
       return street + " ," + district + " ,Nº " + number + " ," + city + " - " + state;
    }
}
