package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String gender;
    private Date dateOfBirth;
    private String avatarImage;
    private int status;
}
