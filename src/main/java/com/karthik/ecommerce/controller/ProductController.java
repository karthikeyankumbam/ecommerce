package com.karthik.ecommerce.controller;

import com.karthik.ecommerce.model.Product;
import com.karthik.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    @Qualifier("fakeStoreService")
    ProductService productService;
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
        Product product=productService.getProductById(id);
        return product;
    }

}
