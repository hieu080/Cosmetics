package org.example.api.service;

import org.example.api.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto create(CategoryDto categoryDto);

    List<CategoryDto> getAll();

    CategoryDto getById(int id);

    CategoryDto update(CategoryDto categoryDto);
}
