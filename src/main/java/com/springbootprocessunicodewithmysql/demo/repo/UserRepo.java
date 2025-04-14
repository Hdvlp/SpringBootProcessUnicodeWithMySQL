package com.springbootprocessunicodewithmysql.demo.repo;

import com.springbootprocessunicodewithmysql.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    User findFirstOrderByDisplayname(String displayname);

}