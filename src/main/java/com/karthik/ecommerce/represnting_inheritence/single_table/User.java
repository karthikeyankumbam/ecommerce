package com.karthik.ecommerce.represnting_inheritence.single_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="st_user")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.STRING
)
@DiscriminatorValue(value = "user")
public class User {
    @Id
    private long id;
    private String name;
    private String email;
}
