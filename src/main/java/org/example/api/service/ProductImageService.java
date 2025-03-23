package org.example.api.service;

import org.example.api.dto.ProductImageDto;
import java.util.List;

public interface ProductImageService {
    ProductImageDto create(ProductImageDto productImageDto);
    ProductImageDto update(int id, ProductImageDto productImageDto);
    void delete(int id);
    ProductImageDto getById(int id);
    List<ProductImageDto> getByProductDetailId(int productDetailId);
}
