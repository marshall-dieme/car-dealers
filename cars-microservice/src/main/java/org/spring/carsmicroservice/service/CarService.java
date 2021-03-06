package org.spring.carsmicroservice.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.spring.carsmicroservice.model.Car;
import org.spring.carsmicroservice.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    
    @Autowired
    CarRepo repo;

    public Car addCar(Car car) {
        return repo.saveAndFlush(car);
    }

    public List<Car> getCars() {
        return repo.findAll() != null ? repo.findAll() : null;
    }

    public Car getCar(int id) {
        return repo.getById(id) != null ? repo.getById(id) : null;
    }

    public Car editCar(int id, Car car) {
        Car c = getCar(id);
        if (c != null) {
            car.setId(c.getId());
            return repo.saveAndFlush(car);
        }

        return null;
    }

    public boolean deleteCar(int id) {
        Car car = getCar(id);
        if (car != null) {
            repo.delete(car);
            return true;
        }

        return false;
    }

    public List<String> getMake() {
        return repo.findDistinctByMake().stream().map(c -> c.getMake()).collect(Collectors.toList());
    }

    public List<String> getModel() {
        return repo.findDistinctByModel().stream().map(c -> c.getModel()).collect(Collectors.toList());
    }

    public List<String> getType() {
        return repo.findDistinctByType().stream().map(c -> c.getType()).collect(Collectors.toList());
    }

    public List<Car> searchList(String make, String model, String type, String used) {
        return repo.findByMakeOrModelOrTypeOrUsed(make, model, type, used);
    }

    public List<Car> getLatestCars() {
        return repo.findAll().stream().sorted(Collections.reverseOrder()).limit(6).toList();
    }
}