package org.example.api.mapper;

import org.example.api.dto.ProductDto;
import org.example.api.entity.Product;

public class ProductMapper {
    public static ProductDto toDto(Product product) {
        if (product == null) {
            return null;
        }

        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setCreateTime(product.getCreateTime());
        dto.setLastTime(product.getLastTime());
        dto.setAverageStar(product.getAverageStar());
        dto.setStatus(product.getStatus());
        dto.setDiscount(product.getDiscount());
        dto.setImage(product.getImage());
        dto.setCategoryId(product.getCategoryId());

        return dto;
    }

    public static Product toEntity(ProductDto dto) {
        if (dto == null) {
            return null;
        }

        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setCreateTime(dto.getCreateTime());
        product.setLastTime(dto.getLastTime());
        product.setAverageStar(dto.getAverageStar());
        product.setStatus(dto.getStatus());
        product.setDiscount(dto.getDiscount());
        product.setImage(dto.getImage());
        product.setCategoryId(dto.getCategoryId());

        return product;
    }
}
