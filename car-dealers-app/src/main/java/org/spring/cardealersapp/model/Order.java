package org.spring.cardealersapp.model;

import java.util.Date;
import java.util.Objects;

public class Order {
    
    private int id;

    private String orderNo;

    private Date orderDate;

    private int carId;

    private int userId;

    public Order() {
        this.orderDate = new Date();
    }
    
    public Order(String orderNo, int carId, int userId) {
        this.orderNo = orderNo;
        this.carId = carId;
        this.userId = userId;
        this.orderDate = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return id == order.id && Objects.equals(orderNo, order.orderNo) && Objects.equals(orderDate, order.orderDate) && carId == order.carId && userId == order.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNo, orderDate, carId, userId);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", orderNo='" + getOrderNo() + "'" +
            ", orderDate='" + getOrderDate() + "'" +
            ", carId='" + getCarId() + "'" +
            ", userId='" + getUserId() + "'" +
            "}";
    }
}