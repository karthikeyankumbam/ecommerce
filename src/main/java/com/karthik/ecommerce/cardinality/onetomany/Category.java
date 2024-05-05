package com.karthik.ecommerce.cardinality.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {
    @Id
    private long id;
    private String name;
    @OneToMany//(mappedBy = "category")
    private List<Product> products;
}
