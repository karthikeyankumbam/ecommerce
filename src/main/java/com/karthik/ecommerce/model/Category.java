package com.karthik.ecommerce.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    private long id;
    private String name;
}
