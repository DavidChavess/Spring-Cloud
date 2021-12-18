package com.davidchaves.supplier.service;

import com.davidchaves.supplier.controller.response.SupplierResponse;
import com.davidchaves.supplier.model.Supplier;

public interface SupplierService {
    SupplierResponse getBySigla(String state);
    Supplier getByUiid(String uiid);
}
