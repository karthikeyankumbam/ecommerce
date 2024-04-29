package com.karthik.ecommerce.represnting_inheritence.mapped_superclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
}
