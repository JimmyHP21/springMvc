package com.renan.controller;

import com.renan.model.Oportunidade;
import com.renan.model.Restaurants;
import com.renan.repository.RestaurantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/restaurants")
public class RestaurantesController {

    @Autowired
    private RestaurantesRepository restaurantesRepository;

    @GetMapping
    public List<Restaurants> listar() {
        return restaurantesRepository.findAll();
    }
}
