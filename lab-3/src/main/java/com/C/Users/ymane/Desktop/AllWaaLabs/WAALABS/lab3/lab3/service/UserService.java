package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {

    void save(User user);

    void deleteById(long Id);

    Post getById(long Id);


    List<User> findAll();

    void update(Long Id, User user);


   List<Post> findPosts(Long id);

    List<User> findUserByPostGreaterThan(@Param("y") int y);

}
