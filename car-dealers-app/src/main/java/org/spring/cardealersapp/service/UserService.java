package org.spring.cardealersapp.service;


import org.spring.cardealersapp.interfaces.UserProxy;
import org.spring.cardealersapp.model.Login;
import org.spring.cardealersapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserProxy proxy;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       return proxy.getByUsername(username);
    }
    
    public User getUser(Login login) {
        return proxy.login(login);
    }
}