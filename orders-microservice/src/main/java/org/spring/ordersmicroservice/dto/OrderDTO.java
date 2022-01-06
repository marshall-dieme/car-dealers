package org.spring.ordersmicroservice.dto;

import java.util.Objects;

public class OrderDTO {
    private int carId;

    private int userId;


    public OrderDTO() {
    }

    public OrderDTO(int carId, int userId) {
        this.carId = carId;
        this.userId = userId;
    }

    public int getCarId() {
        return this.carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public OrderDTO carId(int carId) {
        setCarId(carId);
        return this;
    }

    public OrderDTO userId(int userId) {
        setUserId(userId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrderDTO)) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) o;
        return carId == orderDTO.carId && userId == orderDTO.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, userId);
    }

    @Override
    public String toString() {
        return "{" +
            " carId='" + getCarId() + "'" +
            ", userId='" + getUserId() + "'" +
            "}";
    }

}