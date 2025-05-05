package com.myapp.productService.services.sortingService;

import com.myapp.productService.models.Product;

import java.util.List;

public interface Sorter {
    List<Product> sort(List<Product> products);
}
