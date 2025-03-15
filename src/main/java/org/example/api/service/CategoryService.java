package org.example.api.service;

import org.example.api.dto.CategoryDto;

import java.util.List;


public interface CategoryService {
    CategoryDto create(CategoryDto categoryDto);
    CategoryDto getById(int id);
    List<CategoryDto> getAll();
    CategoryDto update(int id, CategoryDto categoryDto);
    void delete(int id);
}
