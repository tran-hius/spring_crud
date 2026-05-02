package com.hieu.springboot_crud_api.service;

import lombok.*;

import java.util.List;

import org.springframework.stereotype.Service;
import com.hieu.springboot_crud_api.adapter.ProductAdapter;
import com.hieu.springboot_crud_api.dto.request.ProductRequest;
import com.hieu.springboot_crud_api.dto.response.ProductResponse;
import com.hieu.springboot_crud_api.repository.ProductRepository;
import com.hieu.springboot_crud_api.entity.Product;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductAdapter productAdapter;

    public ProductResponse save(ProductRequest request) {
        Product product = productAdapter.toEntity(request);
        return productAdapter.toResponse(productRepository.save(product));
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(productAdapter::toResponse)
                .toList();
    }
}
