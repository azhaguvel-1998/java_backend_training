package com.ani.unit.testing.demo.service;

import com.ani.unit.testing.demo.domain.Car;
import exception.InvalidIdException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public Car saveCar(Car car) {

        return car;
    }
    @Override
    public Optional<Car> findCarById(Long id) {
        if(id <= 0) throw new InvalidIdException("Id must be positive : "+id);
        return Optional.of(new Car());
    }
}
