package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class User {
    @Id
    private long id;
    private String name;
    private String email;
}
