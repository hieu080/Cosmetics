package org.example.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailDto {
    private Integer id;
    private int productId;
    private String type;
    private double price;
    private int quantityAvailable;
    private int quantitySolds;
    private int status;
}
