package org.example.api.mapper;

import org.example.api.dto.EmployeeDto;
import org.example.api.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto toDto(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setRoleId(employee.getRoleId());
        dto.setPhone(employee.getPhone());
        dto.setEmail(employee.getEmail());
        dto.setDateOfBirth(employee.getDateOfBirth());
        dto.setAddress(employee.getAddress());
        dto.setStatus(employee.isStatus());

        return dto;
    }

    public static Employee toEntity(EmployeeDto dto) {
        if (dto == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setRoleId(dto.getRoleId());
        employee.setPhone(dto.getPhone());
        employee.setEmail(dto.getEmail());
        employee.setDateOfBirth(dto.getDateOfBirth());
        employee.setAddress(dto.getAddress());
        employee.setStatus(dto.isStatus());

        return employee;
    }
}
