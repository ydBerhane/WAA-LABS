package com.waa.lab2.service;

import com.waa.lab2.model.Post;
import com.waa.lab2.model.User;

import java.util.List;

public interface UserService {

    void save (User user);

    void deleteById(long Id);

    Post getById(long Id);


    List<User> findAll();

    void update(long Id, User user);


    public List<Post> findPosts(long id);

}
