package com.renan.repository;

import com.renan.model.Oportunidade;
import com.renan.model.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantesRepository  extends JpaRepository<Restaurants,String> {
}
