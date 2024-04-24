package com.karthik.ecommerce.dto;

import lombok.Data;

@Data
public class FakeProductServiceDto {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
