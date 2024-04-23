package com.karthik.ecommerce.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private Category category;
}
