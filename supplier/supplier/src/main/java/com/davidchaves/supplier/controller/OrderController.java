package com.davidchaves.supplier.controller;

import com.davidchaves.supplier.controller.request.OrderRequest;
import com.davidchaves.supplier.controller.response.OrderResponse;
import com.davidchaves.supplier.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@Slf4j
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public OrderResponse create(@RequestBody OrderRequest orderRequest){
        log.info("Gerando o pedido {}", orderRequest);
        OrderResponse orderResponse = service.create(orderRequest);
        log.info("Pedido gerado com sucesso {}", orderResponse);
        return orderResponse;
    }
}
