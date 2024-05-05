package com.karthik.ecommerce.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String categoryName;
}
