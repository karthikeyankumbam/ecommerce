package com.karthik.ecommerce.controller;

import com.karthik.ecommerce.dto.ProductRequest;
import com.karthik.ecommerce.model.Product;
import com.karthik.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController(@Qualifier("mysqlProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
        return productService.getProductById(id);
    }
    @GetMapping("/fetchall")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("/create")
    public Product createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest.getTitle(),
                productRequest.getDescription(),
                productRequest.getImage(),
                productRequest.getPrice(),
                productRequest.getCategoryName());
    }


}
