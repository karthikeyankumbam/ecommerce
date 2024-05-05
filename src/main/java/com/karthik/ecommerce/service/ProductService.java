package com.karthik.ecommerce.service;

import com.karthik.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(long id);
    List<Product> getAllProducts();
    Product createProduct();
    Product updateProduct();
    boolean deleteProduct();
}
