package com.davidchaves.supplier.controller;

import com.davidchaves.supplier.controller.response.SupplierResponse;
import com.davidchaves.supplier.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping("/{sigla}")
    public SupplierResponse getBySigla(@PathVariable String sigla) {
        return supplierService.getBySigla( sigla );
    }
}
