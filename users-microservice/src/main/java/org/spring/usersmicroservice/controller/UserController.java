package org.spring.usersmicroservice.controller;

import org.spring.usersmicroservice.model.User;
import org.spring.usersmicroservice.service.UserService;
import org.spring.usersmicroservice.web.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping(value="/register")
    public ResponseEntity<User> registration(@RequestBody User user) {
        return new ResponseEntity<>(service.register(user), HttpStatus.CREATED);
    }

    @PostMapping(value="/login")
    public ResponseEntity<User> login(@RequestBody RequestEntity requestEntity) {
        return new ResponseEntity<User>(service.login(requestEntity.getUsername()), HttpStatus.OK);
    }

    @GetMapping(value="/testFeign")
    public ResponseEntity<String> testFeign() {
        return new ResponseEntity<String>(service.testFeign(), HttpStatus.OK);
    }
    
}