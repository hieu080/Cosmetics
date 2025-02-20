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
@Table(name = "[Order]") // Vì 'Order' là từ khóa SQL, cần đặt trong dấu []
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "UserId", nullable = false)
    private int userId;

    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate = new Date();

    @Column(name = "TotalAmount", nullable = false)
    private double totalAmount = 0.0;

    @Column(name = "Status", nullable = false)
    private int status; // 0 = Pending, 1 = Confirmed, 2 = Shipping, 3 = Completed, 4 = Canceled
}
