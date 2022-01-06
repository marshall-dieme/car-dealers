package org.spring.ordersmicroservice.controller;

import java.util.List;

import org.spring.ordersmicroservice.dto.OrderDTO;
import org.spring.ordersmicroservice.model.Order;
import org.spring.ordersmicroservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService service;

    @GetMapping(value="")
    public ResponseEntity<List<Order>> getOrders() {
        return new ResponseEntity<>(service.getOrders(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Integer id) {
        return new ResponseEntity<Order>(service.getOrder(id), HttpStatus.OK);
    }

    @PostMapping(value="")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDto) {
        return new ResponseEntity<>(service.createOrder(orderDto), HttpStatus.CREATED);
    }
    
    @PutMapping(value="edit/{id}")
    public ResponseEntity<Order> editOrder(@PathVariable Integer id, @RequestBody OrderDTO dto) {
        //TODO: process PUT request
        
        return new ResponseEntity<Order>(service.editOrder(id, dto.getCarId()), HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Boolean> deleteOrder(@PathVariable Integer id) {
        return new ResponseEntity<Boolean>(service.deleteOrder(id), HttpStatus.OK);
    }
}