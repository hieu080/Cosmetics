package org.example.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductImageDto {
    private Integer id;
    private int productDetailId;
    private String imageLink;
    private boolean status;
}
