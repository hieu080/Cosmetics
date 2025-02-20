package org.example.api.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", columnDefinition = "NVARCHAR(MAX)")
    private String description;

    @Column(name = "CreateTime", columnDefinition = "DATETIME DEFAULT GETDATE()")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime = new Date(); // Mặc định là ngày hiện tại

    @Column(name = "LastTime", columnDefinition = "DATETIME DEFAULT GETDATE()")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastTime = new Date(); // Mặc định là ngày hiện tại

    @Column(name = "AverageStar", columnDefinition = "FLOAT DEFAULT 0")
    private float averageStar = 0.0f; // Đánh giá mặc định = 0

    @Column(name = "Status", nullable = false, columnDefinition = "TINYINT DEFAULT 4")
    private int status = 4; // Mặc định là "Pending Approval"

    @Column(name = "Discount", columnDefinition = "DECIMAL(5,2) DEFAULT 0")
    private double discount = 0.0; // Mặc định không giảm giá

    @Column(name = "Image", columnDefinition = "NVARCHAR(255)")
    private String image;

    @Column(name = "CategoryId", nullable = false)
    private int categoryId;

}
