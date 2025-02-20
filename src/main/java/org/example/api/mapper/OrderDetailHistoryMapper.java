package org.example.api.mapper;

import org.example.api.dto.OrderDetailHistoryDto;
import org.example.api.entity.OrderDetailHistory;

public class OrderDetailHistoryMapper {
    public static OrderDetailHistoryDto toDto(OrderDetailHistory orderDetailHistory) {
        if (orderDetailHistory == null) {
            return null;
        }

        OrderDetailHistoryDto dto = new OrderDetailHistoryDto();
        dto.setId(orderDetailHistory.getId());
        dto.setOrderHistoryId(orderDetailHistory.getOrderHistoryId());
        dto.setProductDetailId(orderDetailHistory.getProductDetailId());
        dto.setQuantity(orderDetailHistory.getQuantity());
        dto.setUnitPrice(orderDetailHistory.getUnitPrice());
        dto.setDiscount(orderDetailHistory.getDiscount());
        dto.setStatus(orderDetailHistory.isStatus());

        return dto;
    }

    public static OrderDetailHistory toEntity(OrderDetailHistoryDto dto) {
        if (dto == null) {
            return null;
        }

        OrderDetailHistory orderDetailHistory = new OrderDetailHistory();
        orderDetailHistory.setOrderHistoryId(dto.getOrderHistoryId());
        orderDetailHistory.setProductDetailId(dto.getProductDetailId());
        orderDetailHistory.setQuantity(dto.getQuantity());
        orderDetailHistory.setUnitPrice(dto.getUnitPrice());
        orderDetailHistory.setDiscount(dto.getDiscount());
        orderDetailHistory.setStatus(dto.isStatus());

        return orderDetailHistory;
    }
}
