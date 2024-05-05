package com.karthik.ecommerce.cardinality.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Tags {
    @Id
    private int id;
    private boolean isPresent;
    @ManyToMany
    public List<Products> productsList;
}
