package com.davidchaves.store.service;

import com.davidchaves.store.controller.response.PurchaseResponse;
import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.dto.SupplierDTO;

public interface OrderService {
    PurchaseResponse create(OrderDTO orderDTO);
    SupplierDTO getByState(String state);
}
