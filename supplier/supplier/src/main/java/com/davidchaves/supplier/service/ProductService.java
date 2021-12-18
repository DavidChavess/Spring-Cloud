package com.davidchaves.supplier.service;

import com.davidchaves.supplier.controller.request.ProductRequest;
import com.davidchaves.supplier.controller.response.ProductResponse;
import com.davidchaves.supplier.model.Product;

import java.util.Set;

public interface ProductService {
    ProductResponse create(ProductRequest productRequest);
    Set<ProductResponse> getAll();
    Product getByUiid(String uiid);
}
