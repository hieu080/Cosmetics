package org.example.api.mapper;

import org.example.api.dto.OrderHistoryDto;
import org.example.api.entity.OrderHistory;

public class OrderHistoryMapper {
    public static OrderHistoryDto toDto(OrderHistory orderHistory) {
        if (orderHistory == null) {
            return null;
        }

        OrderHistoryDto dto = new OrderHistoryDto();
        dto.setId(orderHistory.getId());
        dto.setUserId(orderHistory.getUserId());
        dto.setOrderDate(orderHistory.getOrderDate());
        dto.setTotalAmount(orderHistory.getTotalAmount());
        dto.setStatus(orderHistory.isStatus());

        return dto;
    }

    public static OrderHistory toEntity(OrderHistoryDto dto) {
        if (dto == null) {
            return null;
        }

        OrderHistory orderHistory = new OrderHistory();

        orderHistory.setUserId(dto.getUserId());
        orderHistory.setOrderDate(dto.getOrderDate());
        orderHistory.setTotalAmount(dto.getTotalAmount());
        orderHistory.setStatus(dto.isStatus());

        return orderHistory;
    }
}
