package com.davidchaves.supplier.service.impl;

import com.davidchaves.supplier.controller.request.ProductRequest;
import com.davidchaves.supplier.controller.response.ProductResponse;
import com.davidchaves.supplier.exception.NotFoundException;
import com.davidchaves.supplier.model.Product;
import com.davidchaves.supplier.repository.ProductRepository;
import com.davidchaves.supplier.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        var product = modelMapper.map(productRequest, Product.class);
        product.setUiid( UUID.randomUUID().toString() );
        product = productRepository.save(product);
        return modelMapper.map(product, ProductResponse.class);
    }

    @Override
    public Set<ProductResponse> getAll() {
        return productRepository.findAll().stream()
                .map(product -> modelMapper.map(product, ProductResponse.class))
                .collect(Collectors.toSet());
    }

    @Override
    public Product getByUiid(String uiid) {
        return productRepository.findByUiid(uiid)
                .orElseThrow(() -> new NotFoundException("Produto não encontrado."));
    }
}
