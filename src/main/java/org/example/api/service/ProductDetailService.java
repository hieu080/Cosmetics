package org.example.api.service;

import org.example.api.dto.ProductDetailDto;
import java.util.List;

public interface ProductDetailService {
    ProductDetailDto create(ProductDetailDto productDetailDto);
    ProductDetailDto update(int id, ProductDetailDto productDetailDto);
    void delete(int id);
    ProductDetailDto getById(int id);
    List<ProductDetailDto> getAll();
    List<ProductDetailDto> getByProductId(int productId);
}
