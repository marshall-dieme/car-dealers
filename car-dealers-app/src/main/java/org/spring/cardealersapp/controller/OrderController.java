package org.spring.cardealersapp.controller;

import java.util.List;

import org.spring.cardealersapp.interfaces.OrderProxy;
import org.spring.cardealersapp.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin
public class OrderController {
    
    @Autowired
    OrderProxy proxy;

    @GetMapping(value="/orders")
    public List<Order> getOrders() {
        return proxy.getOrders();
    }

    @GetMapping(value="/orders/{id}")
    public Order getOrder(@PathVariable Integer id) {
        return proxy.getOrder(id);
    }

    @PostMapping(value="/orders")
    public Order createOrder(@RequestBody Order order) {
        return proxy.createOrder(order);
    }

    @PutMapping(value="/orders/edit/{id}")
    public Order editOrder(@PathVariable Integer id, @RequestBody Order order) {
        return proxy.editOrder(id, order);
    }

    @PutMapping(value="/orders/delete/{id}")
    public Boolean deleteOrder(@PathVariable Integer id) {
        return proxy.deleteOrder(id);
    }
}