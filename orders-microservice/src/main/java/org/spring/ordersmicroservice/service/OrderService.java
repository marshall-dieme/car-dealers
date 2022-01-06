package org.spring.ordersmicroservice.service;

import java.util.Date;
import java.util.List;

import org.spring.ordersmicroservice.dto.OrderDTO;
import org.spring.ordersmicroservice.model.Order;
import org.spring.ordersmicroservice.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    OrderRepo repo;

    public Order createOrder(OrderDTO dto) {
        Order order = new Order(generateorderNo(), dto.getCarId(), dto.getUserId());
        return repo.saveAndFlush(order);
    }

    public Order getOrder(int id) {
        return repo.getById(id);
    }

    public List<Order> getOrders() {
        return repo.findAll();
    }

    public Order editOrder(int id, int carId) {
        Order order = repo.getById(id);
        order.setCarId(carId);
        return repo.saveAndFlush(order);
    }

    public Boolean deleteOrder(int id) {
        Order order = repo.getById(id);
        if (order != null) {
            repo.delete(order);
            return true;
        }
        return false;
    }

    private String generateorderNo() {
        return "O-" + new Date().toString();
    }
}