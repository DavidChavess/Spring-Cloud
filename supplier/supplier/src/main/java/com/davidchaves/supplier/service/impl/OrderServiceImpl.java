package com.davidchaves.supplier.service.impl;

import com.davidchaves.supplier.controller.request.OrderRequest;
import com.davidchaves.supplier.controller.response.OrderResponse;
import com.davidchaves.supplier.model.Order;
import com.davidchaves.supplier.model.OrderItem;
import com.davidchaves.supplier.model.OrderStatus;
import com.davidchaves.supplier.repository.OrderRepository;
import com.davidchaves.supplier.service.OrderService;
import com.davidchaves.supplier.service.ProductService;
import com.davidchaves.supplier.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final SupplierService supplierService;
    private final ProductService productService;
    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    @Override
    public OrderResponse create(OrderRequest orderRequest) {
        var order = prepareForInsertion(orderRequest);
        order = orderRepository.save(order);
        return modelMapper.map(order, OrderResponse.class);
    }

    private Order prepareForInsertion(OrderRequest orderRequest) {
        var order = Order.builder()
                .uiid(UUID.randomUUID().toString())
                .preparationTime(orderRequest.getItens().size())
                .status(OrderStatus.RECEBIDO)
                .supplier(supplierService.getByUiid(orderRequest.getSupplierUiid()))
                .build();
        addOrderItem(order, orderRequest);
        return order;
    }

    private void addOrderItem(Order order, OrderRequest orderRequest) {
        orderRequest.getItens().stream()
            .map(item -> {
                var product = productService.getByUiid(item.getProductUiid());
                var total = item.getQuantity().multiply(product.getPrice());
                return OrderItem.builder()
                        .uiid(UUID.randomUUID().toString())
                        .product(product)
                        .quantity(item.getQuantity())
                        .total(total)
                        .build();
            })
            .forEach(order::addItem);

        order.setTotal(order.getItens().stream()
                .map(OrderItem::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add));
    }

}
