package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDto {
    private int id;
    private int userId;
    private int productId;
    private int orderHistoryId;
    private int feedbackStar;
    private String comment;
    private int status;
}
