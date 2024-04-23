package com.karthik.ecommerce.dto;

import com.karthik.ecommerce.model.Category;
import lombok.Data;

@Data
public class FakeProductServiceDto {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private Category category;
}
