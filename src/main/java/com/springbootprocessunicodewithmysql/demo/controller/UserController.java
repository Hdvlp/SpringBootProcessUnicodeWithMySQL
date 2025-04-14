package com.springbootprocessunicodewithmysql.demo.controller;


import com.springbootprocessunicodewithmysql.demo.model.User;
import com.springbootprocessunicodewithmysql.demo.repo.UserRepo;
import com.springbootprocessunicodewithmysql.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    @Autowired
    private final UserRepo userRepo;

    public UserController(UserService userService, UserRepo userRepo){
        this.userService = userService;
        this.userRepo = userRepo;
    }

    @GetMapping ("/auto/add")
    public String addUser(){
        try {

            userService.quickAddUsers();

        } catch (Exception e){}

        return "Complete";
    }

    @GetMapping ("/get/unicode/names")
    public List<User> getUser(){
        return userRepo.findAll();
    }
}
