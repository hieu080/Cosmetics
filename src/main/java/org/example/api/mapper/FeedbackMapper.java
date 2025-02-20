package org.example.api.mapper;

import org.example.api.dto.FeedbackDto;
import org.example.api.entity.Feedback;

public class FeedbackMapper {
    public static FeedbackDto toDto(Feedback feedback) {
        if (feedback == null) {
            return null;
        }

        FeedbackDto dto = new FeedbackDto();
        dto.setId(feedback.getId());
        dto.setUserId(feedback.getUserId());
        dto.setProductId(feedback.getProductId());
        dto.setOrderHistoryId(feedback.getOrderHistoryId());
        dto.setFeedbackStar(feedback.getFeedbackStar());
        dto.setComment(feedback.getComment());
        dto.setStatus(feedback.getStatus());

        return dto;
    }

    public static Feedback toEntity(FeedbackDto dto) {
        if (dto == null) {
            return null;
        }

        Feedback feedback = new Feedback();
        feedback.setUserId(dto.getUserId());
        feedback.setProductId(dto.getProductId());
        feedback.setOrderHistoryId(dto.getOrderHistoryId());
        feedback.setFeedbackStar(dto.getFeedbackStar());
        feedback.setComment(dto.getComment());
        feedback.setStatus(dto.getStatus());

        return feedback;
    }
}
