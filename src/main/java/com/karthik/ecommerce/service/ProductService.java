package com.karthik.ecommerce.service;

import com.karthik.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(long id);
    List<Product> getAllProducts();
    Product createProduct(String title,String description,String image, double price,String categoryName);
    Product updatePrice(long productId,double updatedPrice);
    Product updateImage(long productId,String updatedImage);
    boolean deleteProduct();
}
