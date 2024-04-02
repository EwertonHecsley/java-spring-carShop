package com.person.carshop.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.carshop.domain.models.Car;
import com.person.carshop.domain.service.CarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car create(@RequestBody Car dataCar) {
        Car entity = carService.createCar(dataCar);
        return entity;
    }
    

    @GetMapping
    public List<Car> listAllCars() {
        return carService.listAllCars();
    }
}
