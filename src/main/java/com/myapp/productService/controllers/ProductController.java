package com.myapp.productService.controllers;

import com.myapp.productService.dtos.CreateProductRequestDto;
import com.myapp.productService.dtos.CreateProductResponseDto;
import com.myapp.productService.models.Product;
import com.myapp.productService.services.ProductService;
import com.myapp.productService.services.ProductServiceDBImpl;
import com.myapp.productService.services.ProductServiceFakestoreImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
//    @Value("${productService}")
//    private String productServiceType;

//    @Qualifier()
    private ProductService productService;
//
//    @Autowired
//    private String name;



    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public CreateProductResponseDto createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        Product product = productService.createProduct(
            createProductRequestDto.toProduct()
        );

        return CreateProductResponseDto.fromProduct(
                product
        );
        //        return "This product is priced at: " + createProductRequestDto.getPrice();
    }

    @GetMapping("")
    public void getAllProducts() {

    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long id) {
        return "Here is your product: " + id;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {

    }

    public void updateProduct() {}

    public void replaceProduct() {}

}
