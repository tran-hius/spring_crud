package com.hieu.springboot_crud_api.dto.response;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private String unit;
    private String origin;
    private String imageUrl;
    private String stockStatus;
    private LocalDateTime createdAt;
}