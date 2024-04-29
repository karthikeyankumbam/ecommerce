package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import lombok.Data;

@Data
public class TA extends User {
    private double avgRating;
    private String college;
}
