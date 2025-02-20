package org.example.api.mapper;

import org.example.api.dto.ShoppingCartDto;
import org.example.api.entity.ShoppingCart;

public class ShoppingCartMapper {
    public static ShoppingCartDto toDto(ShoppingCart cart) {
        if (cart == null) {
            return null;
        }

        ShoppingCartDto dto = new ShoppingCartDto();
        dto.setId(cart.getId());
        dto.setUserId(cart.getUserId());
        dto.setProductDetailId(cart.getProductDetailId());
        dto.setQuantity(cart.getQuantity());

        return dto;
    }

    public static ShoppingCart toEntity(ShoppingCartDto dto) {
        if (dto == null) {
            return null;
        }

        ShoppingCart cart = new ShoppingCart();
        cart.setUserId(dto.getUserId());
        cart.setProductDetailId(dto.getProductDetailId());
        cart.setQuantity(dto.getQuantity());

        return cart;
    }
}
