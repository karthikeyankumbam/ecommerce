package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_ta")
public class TA extends User {
    private double avgRating;
    private String college;
}
