package com.davidchaves.supplier.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "TB_ORDER")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String uiid;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private Integer preparationTime;

    private String address;

    private BigDecimal total;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private final Set<OrderItem> itens = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    public void addItem(OrderItem orderItem){
        itens.add(orderItem);
    }
}
