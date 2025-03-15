package org.example.api.controller;

import org.example.api.dto.ProductDetailDto;
import org.example.api.service.ProductDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-details")
@CrossOrigin(origins = "*")
public class ProductDetailController {
    private final ProductDetailService productDetailService;

    public ProductDetailController(ProductDetailService productDetailService) {
        this.productDetailService = productDetailService;
    }

    @PostMapping
    public ResponseEntity<ProductDetailDto> create(@RequestBody ProductDetailDto productDetailDto) {
        return ResponseEntity.ok(productDetailService.create(productDetailDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDetailDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(productDetailService.getById(id));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<ProductDetailDto>> getByProductId(@PathVariable int productId) {
        return ResponseEntity.ok(productDetailService.getByProductId(productId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDetailDto> update(@PathVariable int id, @RequestBody ProductDetailDto productDetailDto) {
        return ResponseEntity.ok(productDetailService.update(id, productDetailDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        productDetailService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
