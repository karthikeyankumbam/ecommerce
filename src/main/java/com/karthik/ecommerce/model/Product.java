package com.karthik.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    @ManyToOne
    private Category category;
}
