package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "RoleName", nullable = false, length = 100)
    private String roleName;

    @Column(name = "Status", nullable = false, columnDefinition = "BIT DEFAULT 1")
    private boolean status = true; // true = Active, false = Inactive

}
