package org.example.api.service.impl;

import org.example.api.dto.ProductDetailDto;
import org.example.api.entity.ProductDetail;
import org.example.api.mapper.ProductDetailMapper;
import org.example.api.repository.ProductDetailRepository;
import org.example.api.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Override
    public ProductDetailDto create(ProductDetailDto productDetailDto) {
        ProductDetail productDetail = ProductDetailMapper.toEntity(productDetailDto);
        return ProductDetailMapper.toDto(productDetailRepository.save(productDetail));
    }

    @Override
    public ProductDetailDto update(int id, ProductDetailDto productDetailDto) {
        ProductDetail existingProductDetail = productDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ProductDetail not found"));

        existingProductDetail.setType(productDetailDto.getType());
        existingProductDetail.setPrice(productDetailDto.getPrice());
        existingProductDetail.setQuantityAvailable(productDetailDto.getQuantityAvailable());
        existingProductDetail.setQuantitySolds(productDetailDto.getQuantitySolds());
        existingProductDetail.setStatus(productDetailDto.getStatus());

        return ProductDetailMapper.toDto(productDetailRepository.save(existingProductDetail));
    }

    @Override
    public void delete(int id) {
        productDetailRepository.deleteById(id);
    }

    @Override
    public ProductDetailDto getById(int id) {
        return productDetailRepository.findById(id)
                .map(ProductDetailMapper::toDto)
                .orElseThrow(() -> new RuntimeException("ProductDetail not found"));
    }

    @Override
    public List<ProductDetailDto> getAll() {
        return productDetailRepository.findAll().stream()
                .map(ProductDetailMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDetailDto> getByProductId(int productId) {
        return productDetailRepository.findByProductId(productId).stream()
                .map(ProductDetailMapper::toDto)
                .collect(Collectors.toList());
    }
}
