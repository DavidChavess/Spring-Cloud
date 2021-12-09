package com.davidchaves.store.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDTO {
    private Integer id;
    private String uiid;
    private String name;
    private String address;
    private String state;

    @Override
    public String toString() {
        return "SupplierDTO {" +
                "id=" + id +
                ", uiid='" + uiid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
