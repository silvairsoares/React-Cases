package com.aurum.fullstackdevelop.controller;

import com.aurum.fullstackdevelop.Repository.UserRepository;
import com.aurum.fullstackdevelop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Calendar;


@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    Flux<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    void save(@RequestBody User user){
        if(user.getRef()==null || user.getRef().isEmpty())
            user.setRef(String.valueOf(Calendar.getInstance().getTimeInMillis()));
       user =  userRepository.save(user).block();
    }



}

