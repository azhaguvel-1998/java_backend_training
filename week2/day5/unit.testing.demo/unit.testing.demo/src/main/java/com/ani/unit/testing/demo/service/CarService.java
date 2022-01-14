package com.ani.unit.testing.demo.service;

import com.ani.unit.testing.demo.domain.Car;

import java.util.Optional;

public interface CarService {
    Car saveCar(Car car);

    Optional<Car> findCarById(Long id);
}
