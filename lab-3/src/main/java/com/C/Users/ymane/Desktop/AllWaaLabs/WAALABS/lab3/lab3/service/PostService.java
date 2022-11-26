package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostService {

    void save (Post post);

    void deleteById(long Id);

    Post getById(long Id);


    List<Post> findAll();

    void update(long Id, Post post);

    List<Post> findByTitle(String title);

}
