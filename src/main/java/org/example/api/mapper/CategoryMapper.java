package org.example.api.mapper;

import org.example.api.dto.CategoryDto;
import org.example.api.entity.Category;

public class CategoryMapper {
    public static CategoryDto toDto(Category category) {
        if (category == null) {
            return null;
        }
        CategoryDto dto = new CategoryDto();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setCreateTime(category.getCreateTime());
        dto.setLastTime(category.getLastTime());
        dto.setStatus(category.isStatus());
        return dto;
    }

    public static Category toEntity(CategoryDto dto) {
        if (dto == null) {
            return null;
        }
        Category category = new Category();
        category.setName(dto.getName());
        category.setCreateTime(dto.getCreateTime());
        category.setLastTime(dto.getLastTime());
        category.setStatus(dto.isStatus());

        return category;
    }
}
