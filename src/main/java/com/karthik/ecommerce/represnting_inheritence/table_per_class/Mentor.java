package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import lombok.Data;

@Data
public class Mentor extends User {
    private String company;
    private double avgRating;
}
