package com.davidchaves.supplier.controller;

import com.davidchaves.supplier.controller.request.ProductRequest;
import com.davidchaves.supplier.controller.response.ProductResponse;
import com.davidchaves.supplier.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest productRequest){
        return productService.create(productRequest);
    }

    @GetMapping
    public Set<ProductResponse> getAll(){
        return productService.getAll();
    }

}
