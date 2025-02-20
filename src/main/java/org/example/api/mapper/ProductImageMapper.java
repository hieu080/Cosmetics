package org.example.api.mapper;

import org.example.api.dto.ProductImageDto;
import org.example.api.entity.ProductImage;

public class ProductImageMapper {
    public static ProductImageDto toDto(ProductImage productImage) {
        if (productImage == null) {
            return null;
        }

        ProductImageDto dto = new ProductImageDto();
        dto.setId(productImage.getId());
        dto.setProductDetailId(productImage.getProductDetailId());
        dto.setImageLink(productImage.getImageLink());
        dto.setStatus(productImage.isStatus());

        return dto;
    }

    public static ProductImage toEntity(ProductImageDto dto) {
        if (dto == null) {
            return null;
        }

        ProductImage productImage = new ProductImage();
        productImage.setProductDetailId(dto.getProductDetailId());
        productImage.setImageLink(dto.getImageLink());
        productImage.setStatus(dto.isStatus());

        return productImage;
    }
}
