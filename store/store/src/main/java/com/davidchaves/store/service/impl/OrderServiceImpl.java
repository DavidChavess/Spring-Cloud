package com.davidchaves.store.service.impl;

import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.dto.SupplierDTO;
import com.davidchaves.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final RestTemplate restTemplate;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        ResponseEntity<SupplierDTO> supplier = restTemplate
                .exchange(
                    "http://fornecedor/suppliers/".concat(orderDTO.getAddress().getState()),
                    HttpMethod.GET,
                    null,
                    SupplierDTO.class
                );

        System.out.println(supplier.getBody());
        return null;

    }
}
