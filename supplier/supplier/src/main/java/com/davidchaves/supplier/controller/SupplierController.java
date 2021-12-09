package com.davidchaves.supplier.controller;

import com.davidchaves.supplier.dto.SupplierDTO;
import com.davidchaves.supplier.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
@Slf4j
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping("/{sigla}")
    public SupplierDTO getBySigla(@PathVariable String sigla) {
        return supplierService.getBySigla( sigla );
    }
}
