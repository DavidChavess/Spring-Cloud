package com.davidchaves.supplier.service;

import com.davidchaves.supplier.dto.SupplierDTO;

public interface SupplierService {
    SupplierDTO getBySigla(String state);
}
