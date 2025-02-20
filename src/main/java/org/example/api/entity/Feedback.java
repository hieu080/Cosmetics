package org.example.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "UserId", nullable = false)
    private int userId; // 🔥 Thêm quan hệ với User

    @Column(name = "ProductId", nullable = false)
    private int productId; // Liên kết với bảng Product

    @Column(name = "OrderHistoryId", nullable = false)
    private int orderHistoryId; // Liên kết với bảng OrderHistory

    @Column(name = "FeedbackStar", nullable = false)
    private int feedbackStar; // CHECK (FeedbackStar BETWEEN 1 AND 5)

    @Column(name = "Comment", columnDefinition = "NVARCHAR(MAX)")
    private String comment; // Bình luận đánh giá

    @Column(name = "Status", nullable = false)
    private int status = 1;
    // 0 = Hidden (Đánh giá bị ẩn)
    // 1 = Pending (Đánh giá chờ duyệt)
    // 2 = Visible (Đánh giá hiển thị công khai)
}
