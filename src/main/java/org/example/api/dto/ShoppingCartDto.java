package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartDto {
    private int id;
    private int userId;
    private int productDetailId;
    private int quantity;
}
