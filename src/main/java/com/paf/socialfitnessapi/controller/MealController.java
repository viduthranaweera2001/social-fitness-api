package com.paf.socialfitnessapi.controller;

import com.paf.socialfitnessapi.model.Meal;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MealController {

    @PostMapping("/user/{user-id}/meals")
    public Meal createmeal(@PathVariable("user-id") Long id){

        return null;
    }

}
