package org.example.api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductImageDto {
    private int productDetailId;
    private String imageLink;
    private boolean status;
}
