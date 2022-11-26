package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.controller;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.User;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }

    @ResponseStatus
    @GetMapping("/api/v1/users")
    List<User> findAllUsers(){

        return   userService.findAll();
    }





    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    Post findUserById(@PathVariable("id") long id){

        return userService.getById(id);
    }






    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/api/v1/users")
    void create(@RequestBody User user){
        userService.save(user);

    }



    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable long id){

        userService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{Id}")
    void update(long id, Post post ){

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/posts/{y}")
    List<User> getUserGreaterT(@PathVariable int y){

        return userService.findUserByPostGreaterThan(y);
    }

}
