package com.davidchaves.store.client;

import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.dto.SupplierDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("supplier")
public interface SupplierClient {

    @GetMapping("/suppliers/{state}")
    SupplierDTO getByState(@PathVariable String state);

    @PostMapping("/orders")
    void create(@RequestBody OrderDTO orderDTO);
}
