package com.davidchaves.supplier.controller.response;

import com.davidchaves.supplier.model.OrderStatus;
import com.davidchaves.supplier.model.Supplier;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    private String uiid;
    private OrderStatus status;
    private Integer preparationTime;
    private Set<OrderItemResponse> itens;
    private SupplierResponse supplier;
    private BigDecimal total;

    @Override
    public String toString() {
        return "{" +
                "uiid='" + uiid + '\'' +
                ", status=" + status +
                ", preparationTime=" + preparationTime +
                ", itens=" + itens +
                ", supplier=" + supplier +
                ", total=" + total +
                '}';
    }
}
