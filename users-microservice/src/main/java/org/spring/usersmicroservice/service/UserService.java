package org.spring.usersmicroservice.service;

import org.spring.usersmicroservice.model.User;
import org.spring.usersmicroservice.repository.UserRepo;
import org.spring.usersmicroservice.web.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public User register(User user) {
        return repo.saveAndFlush(user);
    }

    public User login(Login login) {
        return repo.findByUsername(login.getUsername());
    }

    public User getByUsername(String username) {
        return repo.findByUsername(username);
    }

    public String testFeign() {
        return "Feign is working fine";
    }
}