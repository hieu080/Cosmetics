package org.example.api.mapper;

import org.example.api.dto.OrderDetailDto;
import org.example.api.entity.OrderDetail;

public class OrderDetailMapper {
    public static OrderDetailDto toDto(OrderDetail orderDetail) {
        if (orderDetail == null) {
            return null;
        }

        OrderDetailDto dto = new OrderDetailDto();
        dto.setId(orderDetail.getId());
        dto.setOrderId(orderDetail.getOrderId());
        dto.setProductDetailId(orderDetail.getProductDetailId());
        dto.setQuantity(orderDetail.getQuantity());
        dto.setUnitPrice(orderDetail.getUnitPrice());
        dto.setDiscount(orderDetail.getDiscount());
        dto.setStatus(orderDetail.isStatus());

        return dto;
    }

    public static OrderDetail toEntity(OrderDetailDto dto) {
        if (dto == null) {
            return null;
        }

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(dto.getOrderId());
        orderDetail.setProductDetailId(dto.getProductDetailId());
        orderDetail.setQuantity(dto.getQuantity());
        orderDetail.setUnitPrice(dto.getUnitPrice());
        orderDetail.setDiscount(dto.getDiscount());
        orderDetail.setStatus(dto.isStatus());

        return orderDetail;
    }
}
