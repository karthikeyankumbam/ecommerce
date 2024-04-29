package com.karthik.ecommerce.represnting_inheritence.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "st_mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
}
