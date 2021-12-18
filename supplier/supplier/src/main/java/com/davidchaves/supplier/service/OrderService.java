package com.davidchaves.supplier.service;

import com.davidchaves.supplier.controller.request.OrderRequest;
import com.davidchaves.supplier.controller.response.OrderResponse;

public interface OrderService {
    OrderResponse create(OrderRequest orderRequest);
}
