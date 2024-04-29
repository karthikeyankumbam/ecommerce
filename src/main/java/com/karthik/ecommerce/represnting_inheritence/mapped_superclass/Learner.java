package com.karthik.ecommerce.represnting_inheritence.mapped_superclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_learner")
public class Learner extends User{
    private String college;
    private String company;
}
