package org.spring.cardealersapp.interfaces;

import java.util.List;

import org.spring.cardealersapp.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Component
@FeignClient(name = "orders-microservice", url = "localhost:8300")
public interface OrderProxy {

    @GetMapping(value="/orders")
    public List<Order> getOrders();

    @GetMapping(value="/orders/{id}")
    public Order getOrder(@RequestParam Integer id);

    @PostMapping(value="/orders")
    public Order createOrder(@RequestBody Order order);

    @PutMapping(value="/orders/edit/{id}")
    public Order editOrder(@PathVariable Integer id, @RequestBody Order order);

    @DeleteMapping(value="/orders/delete/{id}")
    public Boolean deleteOrder(@PathVariable Integer id);

}