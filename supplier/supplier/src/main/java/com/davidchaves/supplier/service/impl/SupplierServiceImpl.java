package com.davidchaves.supplier.service.impl;

import com.davidchaves.supplier.controller.response.SupplierResponse;
import com.davidchaves.supplier.exception.NotFoundException;
import com.davidchaves.supplier.model.Supplier;
import com.davidchaves.supplier.repository.SupplierRepository;
import com.davidchaves.supplier.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository repository;
    private final ModelMapper mapper;

    @Override
    public SupplierResponse getBySigla(String sigla) {
        return repository.findByState(sigla)
                .map(supplier -> mapper.map(supplier, SupplierResponse.class))
                .orElseThrow(() -> new NotFoundException("Fornecedor não encontrado."));
    }

    @Override
    public Supplier getByUiid(String uiid) {
        return repository.findByUiid(uiid)
                .orElseThrow(() -> new NotFoundException("Fornecedor não encontrado."));
    }

}
