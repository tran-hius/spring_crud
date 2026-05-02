package com.hieu.springboot_crud_api.repository;

import com.hieu.springboot_crud_api.entity.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByOrigin(String origin);

    List<Product> findByPriceLessThan(java.math.BigDecimal price);
}
