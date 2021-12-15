package com.davidchaves.supplier.service.impl;

import com.davidchaves.supplier.dto.SupplierDTO;
import com.davidchaves.supplier.exception.NotFoundException;
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
    public SupplierDTO getBySigla(String sigla) {
        return repository.findByState(sigla)
                .map(supplier -> mapper.map(supplier, SupplierDTO.class))
                .orElseThrow(() -> new NotFoundException("Fornecedor não encontrado."));
    }
}
