package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[User]") // SQL Server có từ khóa USER, cần đặt trong dấu ngoặc []
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", nullable = false, length = 255)
    private String name;

    @Column(name = "Phone", length = 20, unique = true)
    private String phone;

    @Column(name = "Email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "Password", nullable = false, length = 255)
    private String password;

    @Column(name = "Gender", length = 10)
    private String gender; // Male, Female, Other

    @Column(name = "DateOfBirth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "AvatarImage", length = 255)
    private String avatarImage;

    @Column(name = "Status", nullable = false)
    private int status = 3;
    // 0 = Inactive (Banned)
    // 1 = Active
    // 2 = Suspended
    // 3 = Unverified
}
