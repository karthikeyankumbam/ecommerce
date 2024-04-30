package com.karthik.ecommerce.cardinality.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Wife {
    @Id
    private long id;
    private String name;
    @OneToOne
    private Husband husband;
}
