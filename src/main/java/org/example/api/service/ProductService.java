package org.example.api.service;

import org.example.api.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto create(ProductDto productDto); // Thêm mới
    ProductDto getById(int id);               // Lấy theo ID
    List<ProductDto> getAll();                // Lấy danh sách
    ProductDto update(int id, ProductDto productDto); // Cập nhật
    void delete(int id);                      // Xóa
}

