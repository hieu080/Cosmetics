package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "OrderId", nullable = false)
    private int orderId;

    @Column(name = "ProductDetailId", nullable = false)
    private int productDetailId; // Liên kết với ProductDetail

    @Column(name = "Quantity", nullable = false)
    private int quantity = 1; // CHECK (Quantity > 0)

    @Column(name = "UnitPrice", nullable = false)
    private double unitPrice;

    @Column(name = "Discount")
    private double discount = 0.0;

    @Column(name = "Status", nullable = false)
    private boolean status = true; // 0 = Inactive, 1 = Active
}
