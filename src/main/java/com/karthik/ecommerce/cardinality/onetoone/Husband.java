package com.karthik.ecommerce.cardinality.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Husband {
    @Id
    private long id;
    private String name;

    @OneToOne(mappedBy = "husband")
    private Wife wife;
}
