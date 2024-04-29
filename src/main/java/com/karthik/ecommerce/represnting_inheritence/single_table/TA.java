package com.karthik.ecommerce.represnting_inheritence.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "st_ta")
public class TA extends User {
    private double avgRating;
    private String college;
}
