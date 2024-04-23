package com.karthik.ecommerce.service;


import com.karthik.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("service1")
public class ProductServiceImpl1 implements ProductService{

    @Override
    public Product getProductById(String id) {
        return null;
    }
}
