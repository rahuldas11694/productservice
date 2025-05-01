package com.myapp.productService.services;

import com.myapp.productService.models.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product partialUpdateProduct(Long productId, Product product);
}
