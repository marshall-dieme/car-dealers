package org.spring.cardealersapp.interfaces;

import org.spring.cardealersapp.model.User;
import org.spring.cardealersapp.model.Admin;
import org.spring.cardealersapp.web.RequestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Component
@FeignClient(name = "users-microservice", url = "localhost:8100")
public interface UserProxy {

    @PostMapping(value="/register")
    public User registration(@RequestBody User user);

    @PostMapping(value="/login")
    public User login(@RequestBody RequestEntity user);

    @PostMapping(value="/admin/register")
    public Admin adminRegistration(@RequestBody Admin user);

    @PostMapping(value="/admin/login")
    public Admin adminLogin(@RequestBody RequestEntity user);

    @GetMapping(value="/testFeign")
    public String testFeign();

}