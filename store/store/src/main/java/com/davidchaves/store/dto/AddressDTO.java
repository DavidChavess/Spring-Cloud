package com.davidchaves.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
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
