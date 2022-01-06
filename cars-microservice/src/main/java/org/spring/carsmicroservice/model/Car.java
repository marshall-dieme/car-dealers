package org.spring.carsmicroservice.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 100)
    private String make;

    @Column(length = 100)
    private String model;

    private int year;

    private int mileage;

    @Column(length = 100)
    private String interior;

    @Column(length = 100)
    private String exterior;

    private int doors;

    @Column(length = 100)
    private String engine;

    @Column(length = 100)
    private String drivetrain;

    @Column(length = 100)
    private String transmission;

    @Column(length = 100)
    private String vinNumber;

    @Column(length = 100)
    private String stockNumber;

    private String[] pictures;

    private int quantity;


    public Car() {
    }

    public Car(int id, String make, String model, int year, int mileage, String interior, String exterior, int doors, String engine, String drivetrain, String transmission, String vinNumber, String stockNumber, String[] pictures, int quantity) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.interior = interior;
        this.exterior = exterior;
        this.doors = doors;
        this.engine = engine;
        this.drivetrain = drivetrain;
        this.transmission = transmission;
        this.vinNumber = vinNumber;
        this.stockNumber = stockNumber;
        this.pictures = pictures;
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getInterior() {
        return this.interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getExterior() {
        return this.exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrivetrain() {
        return this.drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getVinNumber() {
        return this.vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getStockNumber() {
        return this.stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String[] getPictures() {
        return this.pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Car id(int id) {
        setId(id);
        return this;
    }

    public Car make(String make) {
        setMake(make);
        return this;
    }

    public Car model(String model) {
        setModel(model);
        return this;
    }

    public Car year(int year) {
        setYear(year);
        return this;
    }

    public Car mileage(int mileage) {
        setMileage(mileage);
        return this;
    }

    public Car interior(String interior) {
        setInterior(interior);
        return this;
    }

    public Car exterior(String exterior) {
        setExterior(exterior);
        return this;
    }

    public Car doors(int doors) {
        setDoors(doors);
        return this;
    }

    public Car engine(String engine) {
        setEngine(engine);
        return this;
    }

    public Car drivetrain(String drivetrain) {
        setDrivetrain(drivetrain);
        return this;
    }

    public Car transmission(String transmission) {
        setTransmission(transmission);
        return this;
    }

    public Car vinNumber(String vinNumber) {
        setVinNumber(vinNumber);
        return this;
    }

    public Car stockNumber(String stockNumber) {
        setStockNumber(stockNumber);
        return this;
    }

    public Car pictures(String[] pictures) {
        setPictures(pictures);
        return this;
    }

    public Car quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return id == car.id && Objects.equals(make, car.make) && Objects.equals(model, car.model) && year == car.year && mileage == car.mileage && Objects.equals(interior, car.interior) && Objects.equals(exterior, car.exterior) && doors == car.doors && Objects.equals(engine, car.engine) && Objects.equals(drivetrain, car.drivetrain) && Objects.equals(transmission, car.transmission) && Objects.equals(vinNumber, car.vinNumber) && Objects.equals(stockNumber, car.stockNumber) && Objects.equals(pictures, car.pictures) && quantity == car.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, year, mileage, interior, exterior, doors, engine, drivetrain, transmission, vinNumber, stockNumber, pictures, quantity);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", mileage='" + getMileage() + "'" +
            ", interior='" + getInterior() + "'" +
            ", exterior='" + getExterior() + "'" +
            ", doors='" + getDoors() + "'" +
            ", engine='" + getEngine() + "'" +
            ", drivetrain='" + getDrivetrain() + "'" +
            ", transmission='" + getTransmission() + "'" +
            ", vinNumber='" + getVinNumber() + "'" +
            ", stockNumber='" + getStockNumber() + "'" +
            ", pictures='" + getPictures() + "'" +
            ", quantity='" + getQuantity() + "'" +
            "}";
    }

}