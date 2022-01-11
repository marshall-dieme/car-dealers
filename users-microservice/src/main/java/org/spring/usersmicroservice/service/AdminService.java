package org.spring.usersmicroservice.service;

import org.spring.usersmicroservice.model.Admin;
import org.spring.usersmicroservice.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepo repo;

    public Admin register(Admin user) {
        return repo.saveAndFlush(user);
    }

    public Admin login(String username, String password) {
        return repo.findAll().get(1);
    }

    public String testFeign() {
        return "Feign is working fine";
    }
}