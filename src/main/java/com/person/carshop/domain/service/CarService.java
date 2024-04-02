package com.person.carshop.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.carshop.domain.models.Car;
import com.person.carshop.domain.repositories.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> listAllCars(){
        return carRepository.findAll();
    }

    public Car createCar(Car dataCar){
        return carRepository.save(dataCar);
    }
}
