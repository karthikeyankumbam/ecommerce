package com.karthik.ecommerce.cardinality.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    private long id;
    private String name;
    @ManyToOne
    private Category category;
}
