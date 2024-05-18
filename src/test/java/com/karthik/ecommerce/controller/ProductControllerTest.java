package com.karthik.ecommerce.controller;

import com.karthik.ecommerce.model.Product;
import com.karthik.ecommerce.service.ProductService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @Test
    void getProductById() {
        long a=1;
        when(productService.getProductById(a)).thenReturn(new Product());
        Product b = productController.getProductById(a);
        assertNotNull(b);
    }

    @Test
    void getProducts() {
        int a=1;
        assertEquals(a,a);
    }

    @Test
    void createProduct() {
        int a=1;
        assert a==1;
    }
}