package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "UserId", nullable = false)
    private int userId;

    @Column(name = "AddressDetail", nullable = false, length = 255)
    private String addressDetail; // Địa chỉ chi tiết

    @Column(name = "Name", nullable = false, length = 255)
    private String name; // Tên người nhận

    @Column(name = "Phone", nullable = false, length = 20)
    private String phone; // Số điện thoại liên hệ

    @Column(name = "Status", nullable = false, columnDefinition = "BIT DEFAULT 0")
    private boolean status = false; // 0 = Regular, 1 = Default
}
