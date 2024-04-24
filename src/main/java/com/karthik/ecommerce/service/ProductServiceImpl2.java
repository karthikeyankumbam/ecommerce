package com.karthik.ecommerce.service;

import com.karthik.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service
@Qualifier("service2")
public class ProductServiceImpl2 implements ProductService {

    @Override
    public Product getProductById(long id) {
        return null;
    }
}
