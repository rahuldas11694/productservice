package com.myapp.productService.services.filteringService;

import com.myapp.productService.models.Product;

import java.util.List;

public class RAMFilter implements Filter {

    @Override
    public List<Product> apply(List<Product> products, List<String> allowedValues) {
        return List.of();
    }
}
