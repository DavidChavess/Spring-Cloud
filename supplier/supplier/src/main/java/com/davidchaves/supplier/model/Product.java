package com.davidchaves.supplier.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "TB_PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String uiid;

    @Column(nullable = false, length = 100)
    private String name;

    private String state;

    @Column(length = 150)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;
}
