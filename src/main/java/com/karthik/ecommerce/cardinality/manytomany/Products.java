package com.karthik.ecommerce.cardinality.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Products {
    @Id
    private int id;
    private int name;
    @ManyToMany
    private List<Tags> tags;
}
