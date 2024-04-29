package com.karthik.ecommerce.represnting_inheritence.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_learner")
public class Learner extends User {
    private String college;
    private String company;
}
