package com.myapp.productService.services.filteringService;

import com.myapp.productService.models.Product;

import java.util.List;

public interface Filter {

    List<Product> apply(List<Product> products,
                        List<String> allowedValues);
}
