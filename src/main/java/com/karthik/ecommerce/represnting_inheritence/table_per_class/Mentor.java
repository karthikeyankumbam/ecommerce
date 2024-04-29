package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
}
