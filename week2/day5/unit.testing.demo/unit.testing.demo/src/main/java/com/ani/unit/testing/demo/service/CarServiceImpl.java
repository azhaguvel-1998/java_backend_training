package com.ani.unit.testing.demo.service;

import com.ani.unit.testing.demo.domain.Car;
import org.springframework.stereotype.Service;

@Service


public class CarServiceImpl implements CarService {
    @Override
    public Car saveCar(Car car) {

        return car;
    }

}
