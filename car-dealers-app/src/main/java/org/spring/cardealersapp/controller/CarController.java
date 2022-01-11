package org.spring.cardealersapp.controller;

import java.util.List;

import org.spring.cardealersapp.interfaces.CarProxy;
import org.spring.cardealersapp.model.Car;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin
public class CarController {
    
    @Autowired
    CarProxy proxy;

    @GetMapping(value="/cars")
    public List<Car> getCars() {
        return proxy.getCars();
    }

    @GetMapping(value="/cars/{id}")
    public Car getCar(@PathVariable Integer id) {
        return proxy.getCar(id);
    }

    @PostMapping(value="/cars")
    public Car createCar(@RequestBody Car car) {
        return proxy.createCar(car);
    }

    @PutMapping(value="/cars/edit/{id}")
    public Car editCar(@PathVariable Integer id, @RequestBody Car car) {
        return proxy.editCar(id, car);
    }

    @DeleteMapping(value="/cars/delete/{id}")
    public Boolean deleteCar(@PathVariable Integer id) {
        return proxy.deleteCar(id);
    }
    

}