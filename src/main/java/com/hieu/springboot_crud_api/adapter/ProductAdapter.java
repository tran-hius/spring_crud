package com.hieu.springboot_crud_api.adapter;

import org.springframework.stereotype.Component;

import com.hieu.springboot_crud_api.dto.request.ProductRequest;
import com.hieu.springboot_crud_api.dto.response.ProductResponse;
import com.hieu.springboot_crud_api.entity.Product;

@Component
public class ProductAdapter {
    public Product toEntity(ProductRequest request) {
        if (request == null)
            return null;
        return Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .stockQuantity(request.getStockQuantity())
                .unit(request.getUnit())
                .origin(request.getOrigin())
                .build();
    }

    public ProductResponse toResponse(Product entity) {
        if (entity == null)
            return null;
        return ProductResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .stockStatus(entity.getStockQuantity() > 0 ? "CÒN HÀNG" : "HẾT HÀNG")
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
