package org.spring.carsmicroservice.controller;

import java.util.List;

import org.spring.carsmicroservice.model.Car;
import org.spring.carsmicroservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value = "/cars")
public class CarController {
    @Autowired
    CarService service;

    @PostMapping(value="")
    public ResponseEntity<Car> saveCar(@RequestBody Car car) {
        return new ResponseEntity<Car>(service.addCar(car), HttpStatus.CREATED);
    }

    @GetMapping(value="")
    public ResponseEntity<List<Car>> getCars() {
        return new ResponseEntity<List<Car>>(service.getCars(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Integer id) {
        return new ResponseEntity<Car>(service.getCar(id), HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Car> editCar(@PathVariable Integer id, @RequestBody Car car) {
        return new ResponseEntity<Car>(service.editCar(id, car), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteCar(@PathVariable int id) {
        return new ResponseEntity<Boolean>(service.deleteCar(id), HttpStatus.OK);
    }

}