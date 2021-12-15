package com.davidchaves.supplier.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Supplier {
    @Id
    private Integer id;

    @Column(unique = true, nullable = false)
    private String uiid;

    private String name;

    private String address;

    @Column( length = 2 )
    private String state;
}
