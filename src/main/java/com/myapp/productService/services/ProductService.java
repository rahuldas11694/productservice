package com.myapp.productService.services;

import com.myapp.productService.dtos.CreateProductRequestDto;
import com.myapp.productService.models.Product;

public interface ProductService {

    Product createProduct(Product product);
}
