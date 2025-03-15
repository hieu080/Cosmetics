package org.example.api.service.impl;

import org.example.api.dto.ProductDto;
import org.example.api.entity.Product;
import org.example.api.mapper.ProductMapper;
import org.example.api.repository.ProductRepository;
import org.example.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDto create(ProductDto productDto) {
        Product product = ProductMapper.toEntity(productDto);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.toDto(savedProduct);
    }

    @Override
    public ProductDto update(int id, ProductDto productDto) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setLastTime(productDto.getLastTime());
        product.setAverageStar(productDto.getAverageStar());
        product.setStatus(productDto.getStatus());
        product.setDiscount(productDto.getDiscount());
        product.setImage(productDto.getImage());
        product.setCategoryId(productDto.getCategoryId());
        Product updatedProduct = productRepository.save(product);
        return ProductMapper.toDto(updatedProduct);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductDto getById(int id) {
        return productRepository.findById(id).map(ProductMapper::toDto).orElse(null);
    }

    @Override
    public List<ProductDto> getAll() {
        return productRepository.findAll().stream().map(ProductMapper::toDto).collect(Collectors.toList());
    }
}
