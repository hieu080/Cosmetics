package org.example.api.mapper;

import org.example.api.dto.RoleDto;
import org.example.api.entity.Role;

public class RoleMapper {
    public static RoleDto toDto(Role role) {
        if (role == null) {
            return null;
        }

        RoleDto dto = new RoleDto();
        dto.setId(role.getId());
        dto.setRoleName(role.getRoleName());
        dto.setStatus(role.isStatus());

        return dto;
    }

    public static Role toEntity(RoleDto dto) {
        if (dto == null) {
            return null;
        }

        Role role = new Role();
        role.setRoleName(dto.getRoleName());
        role.setStatus(dto.isStatus());

        return role;
    }
}
