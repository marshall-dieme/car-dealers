package org.spring.cardealersapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.spring.cardealersapp.interfaces.UserProxy;
import org.spring.cardealersapp.model.Login;
import org.spring.cardealersapp.model.User;
import org.spring.cardealersapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserProxy proxy;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService service;
    
    @PostMapping(value="/register")
    public User registration(@RequestBody User u) {
        u.setPassword(new BCryptPasswordEncoder().encode(u.getPassword()));
        User user = proxy.registration(u);
        return user;
    }

    @PostMapping(value="/login", consumes = "application/json")
    public UserDetails login(@RequestBody Login login) {
        authenticate(login.getUsername(), login.getPassword());
        return proxy.login(login);
    }

    @PostMapping(value="/authenticate")
    public User authentication(@RequestBody String username) {
        return proxy.getByUsername(username);
    }
    

    @GetMapping(value="/test")
    public ResponseEntity<String> testLink() {
        return new ResponseEntity<String>(proxy.testFeign(), HttpStatus.OK);
    }

    private void authenticate(String username, String password) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }
        catch (DisabledException e) {
            throw new DisabledException("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("INVALID_CREDENTIALS", e);
        }
    }
}