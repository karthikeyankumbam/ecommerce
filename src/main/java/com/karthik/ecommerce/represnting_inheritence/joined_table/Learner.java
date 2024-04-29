package com.karthik.ecommerce.represnting_inheritence.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name="jt_learner")
@PrimaryKeyJoinColumn(name="user_id")
public class Learner extends User {
    private String college;
    private String company;
}
