package com.davidchaves.supplier.repository;

import com.davidchaves.supplier.model.Product;
import com.davidchaves.supplier.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findByUiid(String uiid);
}
