package org.spring.carsmicroservice.repository;

import java.util.List;

import org.spring.carsmicroservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
    
    public List<Car> findDistinctByMake();
    
    public List<Car> findDistinctByModel();
    
    public List<Car> findDistinctByType();

    public List<Car> findByMakeOrModelOrTypeOrUsed(String make, String model, String type, String used);

    public List<Car> findAllDescLimitedTo(int limit);
}