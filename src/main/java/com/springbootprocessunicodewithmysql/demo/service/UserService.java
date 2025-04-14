package com.springbootprocessunicodewithmysql.demo.service;

import com.springbootprocessunicodewithmysql.demo.model.User;
import com.springbootprocessunicodewithmysql.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String autoAdd(User user){
        User newUser = userRepo.save(user);
        return newUser.toString();
    }

    public void quickAddUsers(){

        try {

            List<User> users = new ArrayList<>();
            users.add(new User( "ÖÄÜ100", "ÖÄÜ100", "ÖÄÜ100"));
            users.add(new User( "ÖÄÜ200", "ÖÄÜ200", "ÖÄÜ200"));
            users.add(new User( "ÖÄÜ300", "ÖÄÜ300", "ÖÄÜ300"));

            for(User user : users){
                this.autoAdd(user);
            }

        } catch (Exception e){}


    }

}