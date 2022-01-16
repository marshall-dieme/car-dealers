package org.spring.cardealersapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.spring.cardealersapp.interfaces.UserProxy;
import org.spring.cardealersapp.model.User;
import org.spring.cardealersapp.web.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserProxy proxy;
    
    @PostMapping(value="/register")
    public User registration(@RequestBody User u) {
        User user = proxy.registration(u);
        return user;
    }

    @PostMapping(value="/login")
    public User login(@RequestBody RequestEntity u) {
        User user = proxy.login(u);
        return user;
    }

    @GetMapping(value="/test")
    public ResponseEntity<String> testLink() {
        return new ResponseEntity<String>(proxy.testFeign(), HttpStatus.OK);
    }
    
}