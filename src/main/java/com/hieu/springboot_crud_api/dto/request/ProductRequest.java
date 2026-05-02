package com.hieu.springboot_crud_api.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

    @NotBlank(message = "Tên sản phẩm không được để trống")
    @Size(min = 2, max = 100, message = "Tên sản phẩm phải từ 2 đến 100 ký tự")
    private String name;

    private String description;

    @NotNull(message = "Giá sản phẩm là bắt buộc")
    @DecimalMin(value = "0.0", inclusive = false, message = "Giá sản phẩm phải lớn hơn 0")
    private BigDecimal price;

    @NotNull(message = "Số lượng kho là bắt buộc")
    @Min(value = 0, message = "Số lượng kho không được là số âm")
    private Integer stockQuantity;

    @NotBlank(message = "Đơn vị tính (kg, thùng, túi) là bắt buộc")
    private String unit;

    private String origin;

    private String imageUrl;
}