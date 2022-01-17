package org.spring.usersmicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.usersmicroservice.model.User;
import org.spring.usersmicroservice.service.UserService;
import org.spring.usersmicroservice.web.Login;
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

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping(value="/register")
    public ResponseEntity<User> registration(@RequestBody User user) {
        return new ResponseEntity<>(service.register(user), HttpStatus.CREATED);
    }

    @PostMapping(value="/login", consumes = "application/json")
    public ResponseEntity<User> login(@RequestBody Login login) {
        logger.info("Username : " + login.getUsername());
        return new ResponseEntity<User>(service.login(login), HttpStatus.OK);
    }

    @PostMapping(value="/authentication")
    public ResponseEntity<User> getByUsername(@RequestBody String username) {
        logger.warn("msg : " + username);
        return new ResponseEntity<User>(service.getByUsername(username), HttpStatus.OK);
    }
    

    @GetMapping(value="/testFeign")
    public ResponseEntity<String> testFeign() {
        return new ResponseEntity<String>(service.testFeign(), HttpStatus.OK);
    }
    
}