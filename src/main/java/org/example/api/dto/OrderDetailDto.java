package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {
    private int id;
    private int orderId;
    private int productDetailId;
    private int quantity;
    private double unitPrice;
    private double discount;
    private boolean status;
}
