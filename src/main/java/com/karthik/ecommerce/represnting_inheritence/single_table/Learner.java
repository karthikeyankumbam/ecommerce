package com.karthik.ecommerce.represnting_inheritence.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "st_learner")
public class Learner extends User {
    private String college;
    private String company;
}
