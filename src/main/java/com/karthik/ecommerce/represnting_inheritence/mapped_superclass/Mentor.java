package com.karthik.ecommerce.represnting_inheritence.mapped_superclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_mentor")
public class Mentor extends User{
    private String company;
    private double avgRating;
}
