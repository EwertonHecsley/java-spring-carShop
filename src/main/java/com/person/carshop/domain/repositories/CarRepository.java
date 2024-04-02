package com.person.carshop.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.carshop.domain.models.Car;

public interface CarRepository extends JpaRepository<Car,Integer>{

}
