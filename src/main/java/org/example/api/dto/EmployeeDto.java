package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private int id;
    private String name;
    private int roleId;
    private String phone;
    private String email;
    private Date dateOfBirth;
    private String address;
    private boolean status;
}
