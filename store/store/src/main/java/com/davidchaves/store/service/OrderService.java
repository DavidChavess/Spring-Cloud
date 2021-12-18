package com.davidchaves.store.service;

import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.dto.SupplierDTO;

public interface OrderService {
    void create(OrderDTO orderDTO);
    SupplierDTO getByState(String state);
}
