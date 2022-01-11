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

    @Column(length = 100)
    private String type;

    private int year;

    private int mileage;

    @Column(length = 100)
    private String color;


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

    @Column(length = 100)
    private String used;


    public Car() {
    }

    public Car(int id, String make, String model, int year, int mileage, String color, int doors, String engine, String drivetrain, String transmission, String vinNumber, String stockNumber, String[] pictures, int quantity, String used) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.doors = doors;
        this.engine = engine;
        this.drivetrain = drivetrain;
        this.transmission = transmission;
        this.vinNumber = vinNumber;
        this.stockNumber = stockNumber;
        this.pictures = pictures;
        this.quantity = quantity;
        this.used = used;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, year, mileage, color, doors, engine, drivetrain, transmission, vinNumber, stockNumber, pictures, quantity);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", mileage='" + getMileage() + "'" +
            ", interior='" + getColor() + "'" +
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


    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * @return String return the used
     */
    public String getUsed() {
        return used;
    }

    /**
     * @param used the used to set
     */
    public void setUsed(String used) {
        this.used = used;
    }

}