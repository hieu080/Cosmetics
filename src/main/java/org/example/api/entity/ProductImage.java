package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductImage")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ProductDetailId", nullable = false)
    private int productDetailId;

    @Column(name = "ImageLink", nullable = false, length = 255)
    private String imageLink;

    @Column(name = "Status", nullable = false, columnDefinition = "BIT DEFAULT 1")
    private boolean status = true; // true = Active, false = Inactive
}
