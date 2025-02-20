package org.example.api.mapper;

import org.example.api.dto.ProductDetailDto;
import org.example.api.entity.ProductDetail;

public class ProductDetailMapper {
    public static ProductDetailDto toDto(ProductDetail productDetail) {
        if (productDetail == null) {
            return null;
        }

        ProductDetailDto dto = new ProductDetailDto();
        dto.setId(productDetail.getId());
        dto.setProductId(productDetail.getProductId()); // Lấy ID của sản phẩm
        dto.setType(productDetail.getType());
        dto.setPrice(productDetail.getPrice());
        dto.setQuantityAvailable(productDetail.getQuantityAvailable());
        dto.setQuantitySolds(productDetail.getQuantitySolds());
        dto.setStatus(productDetail.getStatus());

        return dto;
    }

    public static ProductDetail toEntity(ProductDetailDto dto) {
        if (dto == null) {
            return null;
        }

        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(dto.getProductId());
        productDetail.setType(dto.getType());
        productDetail.setPrice(dto.getPrice());
        productDetail.setQuantityAvailable(dto.getQuantityAvailable());
        productDetail.setQuantitySolds(dto.getQuantitySolds());
        productDetail.setStatus(dto.getStatus());


        return productDetail;
    }
}
