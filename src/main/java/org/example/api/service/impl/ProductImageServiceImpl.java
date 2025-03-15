package org.example.api.service.impl;

import org.example.api.dto.ProductImageDto;
import org.example.api.entity.ProductImage;
import org.example.api.mapper.ProductImageMapper;
import org.example.api.repository.ProductImageRepository;
import org.example.api.service.ProductImageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductImageServiceImpl implements ProductImageService {
    private final ProductImageRepository productImageRepository;

    public ProductImageServiceImpl(ProductImageRepository productImageRepository) {
        this.productImageRepository = productImageRepository;
    }

    @Override
    public ProductImageDto create(ProductImageDto productImageDto) {
        ProductImage productImage = ProductImageMapper.toEntity(productImageDto);
        return ProductImageMapper.toDto(productImageRepository.save(productImage));
    }

    @Override
    public ProductImageDto update(int id, ProductImageDto productImageDto) {
        Optional<ProductImage> optionalProductImage = productImageRepository.findById(id);
        if (optionalProductImage.isPresent()) {
            ProductImage productImage = optionalProductImage.get();
            productImage.setImageLink(productImageDto.getImageLink());
            productImage.setStatus(productImageDto.isStatus());
            return ProductImageMapper.toDto(productImageRepository.save(productImage));
        }
        return null;
    }

    @Override
    public void delete(int id) {
        productImageRepository.deleteById(id);
    }

    @Override
    public ProductImageDto getById(int id) {
        return productImageRepository.findById(id)
                .map(ProductImageMapper::toDto)
                .orElse(null);
    }

    @Override
    public List<ProductImageDto> getByProductDetailId(int productDetailId) {
        return productImageRepository.findByProductDetailId(productDetailId).stream()
                .map(ProductImageMapper::toDto)
                .collect(Collectors.toList());
    }
}
