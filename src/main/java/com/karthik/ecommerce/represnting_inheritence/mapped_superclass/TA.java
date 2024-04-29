package com.karthik.ecommerce.represnting_inheritence.mapped_superclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_ta")
public class TA extends User{
    private double avgRating;
    private String college;
}
