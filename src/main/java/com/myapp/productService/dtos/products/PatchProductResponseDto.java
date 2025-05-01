package com.myapp.productService.dtos.products;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatchProductResponseDto {
    private GetProductDto product;
}
