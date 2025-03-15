package org.example.api.controller;

import org.example.api.dto.ProductImageDto;
import org.example.api.service.ProductImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-images")
@CrossOrigin(origins = "*")
public class ProductImageController {
    private final ProductImageService productImageService;

    public ProductImageController(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    @PostMapping
    public ResponseEntity<ProductImageDto> create(@RequestBody ProductImageDto productImageDto) {
        return ResponseEntity.ok(productImageService.create(productImageDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductImageDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(productImageService.getById(id));
    }

    @GetMapping("/product-detail/{productDetailId}")
    public ResponseEntity<List<ProductImageDto>> getByProductDetailId(@PathVariable int productDetailId) {
        return ResponseEntity.ok(productImageService.getByProductDetailId(productDetailId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductImageDto> update(@PathVariable int id, @RequestBody ProductImageDto productImageDto) {
        return ResponseEntity.ok(productImageService.update(id, productImageDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        productImageService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
