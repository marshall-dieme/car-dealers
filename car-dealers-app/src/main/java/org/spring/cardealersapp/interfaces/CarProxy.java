package org.spring.cardealersapp.interfaces;

import java.util.List;

import org.spring.cardealersapp.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@Component
@FeignClient(name = "cars-microservice", url = "localhost:8200")
public interface CarProxy {
    
    @GetMapping(value="/cars")
    public List<Car> getCars();


    @GetMapping(value="/cars/{id}")
    public Car getCar(@PathVariable Integer id);

    @PostMapping(value="/cars")
    public Car createCar(@RequestBody Car car);

    @PutMapping(value="/cars/edit/{id}")
    public Car editCar(@PathVariable Integer id, @RequestBody Car car);

    @DeleteMapping(value = "/cars/delete/{id}")
    public Boolean deleteCar(@PathVariable Integer id);
}