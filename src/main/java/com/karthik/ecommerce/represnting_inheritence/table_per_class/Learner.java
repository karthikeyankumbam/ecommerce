package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import lombok.Data;

@Data
public class Learner extends User {
    private String college;
    private String company;
}
