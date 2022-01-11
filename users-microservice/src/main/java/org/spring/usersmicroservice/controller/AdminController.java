package org.spring.usersmicroservice.controller;

import org.spring.usersmicroservice.model.Admin;
import org.spring.usersmicroservice.service.AdminService;
import org.spring.usersmicroservice.web.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AdminService service;

    @PostMapping(value="/register")
    public ResponseEntity<Admin> registration(@RequestBody Admin user) {
        return new ResponseEntity<>(service.register(user), HttpStatus.CREATED);
    }

    @PostMapping(value="/login")
    public ResponseEntity<Admin> login(@RequestBody RequestEntity requestEntity) {
        return new ResponseEntity<Admin>(service.login(requestEntity.getUsername(), requestEntity.getPassword()), HttpStatus.OK);
    }

    @GetMapping(value="/testFeign")
    public ResponseEntity<String> testFeign() {
        return new ResponseEntity<String>(service.testFeign(), HttpStatus.OK);
    }
    
}