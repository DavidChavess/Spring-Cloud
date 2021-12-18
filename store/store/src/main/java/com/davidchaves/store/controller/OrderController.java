package com.davidchaves.store.controller;

import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.dto.SupplierDTO;
import com.davidchaves.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody OrderDTO orderDTO){
        log.info("Criando o pedido {}", orderDTO);
        orderService.create(orderDTO);
        log.info("pedido criado!");
    }

    @GetMapping("/{state}")
    public SupplierDTO getByState(@PathVariable String state){
        log.info("Buscando o fornecesor através do estado {}", state);
        SupplierDTO supplierDTO =  orderService.getByState(state);
        log.info("Fornecedor encontrado {}", supplierDTO);
        return supplierDTO;
    }

}
