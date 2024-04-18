package com.paf.socialfitnessapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mealType;
    private String recipes;
    private String ingredients;
    private String nutrition;
    private String portion;
    private String instructions;
    private String mealimg;

}
