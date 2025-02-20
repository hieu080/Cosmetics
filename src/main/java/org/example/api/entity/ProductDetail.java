package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductDetail")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ProductId", nullable = false)
    private int productId;

    @Column(name = "Type", nullable = false, length = 100)
    private String type;

    @Column(name = "Price", nullable = false, columnDefinition = "DECIMAL(10,2)")
    private double price;

    @Column(name = "QuantityAvailable", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int quantityAvailable = 0;

    @Column(name = "QuantitySolds", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int quantitySolds = 0;

    @Column(name = "Status", nullable = false, columnDefinition = "TINYINT DEFAULT 1")
    private int status = 1; // Mặc định là Active

}
