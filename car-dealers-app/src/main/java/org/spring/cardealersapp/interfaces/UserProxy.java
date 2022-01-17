package org.spring.cardealersapp.interfaces;

import org.spring.cardealersapp.model.Login;
import org.spring.cardealersapp.model.User;
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
    public User login(@RequestBody Login login);

    @GetMapping(value="/testFeign")
    public String testFeign();

    @PostMapping(value = "/authentication")
    public User getByUsername(String username);

}