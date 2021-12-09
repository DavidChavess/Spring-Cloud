package com.davidchaves.store.controller;

import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public OrderDTO create(@RequestBody OrderDTO orderDTO){
        return orderService.create(orderDTO);
    }

}
