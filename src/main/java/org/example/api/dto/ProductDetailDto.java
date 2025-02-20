package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailDto {
    private int id;
    private int productId;
    private String type;
    private double price;
    private int quantityAvailable;
    private int quantitySolds;
    private int status;
}
