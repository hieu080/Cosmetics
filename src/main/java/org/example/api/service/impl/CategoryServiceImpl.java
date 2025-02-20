package org.example.api.service.impl;

import lombok.AllArgsConstructor;
import org.example.api.dto.CategoryDto;
import org.example.api.entity.Category;
import org.example.api.mapper.CategoryMapper;
import org.example.api.repository.CategoryRepository;
import org.example.api.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto create(CategoryDto categoryDto) {
        Category category = CategoryMapper.toEntity(categoryDto);
        Category saveCategory = categoryRepository.save(category);
        return CategoryMapper.toDto(saveCategory);
    }

    @Override
    public List<CategoryDto> getAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(CategoryMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto getById(int id) {
        Category category = categoryRepository.findById(id).orElse(null);
        return CategoryMapper.toDto(category);
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto) {
        return null;
    }

}
