package com.karthik.ecommerce.represnting_inheritence.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name="jt_user")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
    @Id
    private long id;
    private String name;
    private String email;
}
