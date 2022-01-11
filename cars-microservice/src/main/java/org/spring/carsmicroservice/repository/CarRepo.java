package org.spring.carsmicroservice.repository;

import java.util.List;

import org.spring.carsmicroservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
    
    @Query("SELECT DISTINCT c.make FROM Car c")
    public List<Car> findDistinctByMake();
    
    @Query("SELECT DISTINCT c.model FROM Car c")
    public List<Car> findDistinctByModel();

    @Query("SELECT DISTINCT c.type FROM Car c")
    public List<Car> findDistinctByType();

    public List<Car> findByMakeOrModelOrTypeOrUsed(String make, String model, String type, String used);

}