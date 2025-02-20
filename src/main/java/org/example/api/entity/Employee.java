package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", nullable = false, length = 255)
    private String name;

    @Column(name = "RoleId", nullable = false)
    private int roleId;

    @Column(name = "Phone", length = 20, unique = true)
    private String phone;

    @Column(name = "Email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "Password", nullable = false, length = 255)
    private String password;

    @Column(name = "DateOfBirth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "Address", nullable = false, length = 500)
    private String address; // Thêm trường địa chỉ

    @Column(name = "Status", nullable = false, columnDefinition = "BIT DEFAULT 1")
    private boolean status = true; // true = Active, false = Inactive
}
