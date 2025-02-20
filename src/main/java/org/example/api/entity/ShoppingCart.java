package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "UserId", nullable = false)
    private int userId; // Lưu UserId thay vì ánh xạ đối tượng User

    @Column(name = "ProductDetailId", nullable = false)
    private int productDetailId; // Lưu ProductDetailId thay vì ánh xạ đối tượng ProductDetail

    @Column(name = "Quantity", nullable = false)
    private int quantity = 1; // Số lượng mặc định là 1, không được nhỏ hơn 1
}
