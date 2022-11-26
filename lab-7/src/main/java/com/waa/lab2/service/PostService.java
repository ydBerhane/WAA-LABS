package com.waa.lab2.service;

import com.waa.lab2.model.Post;
import com.waa.lab2.repository.PostRepository;

import javax.persistence.Id;
import java.util.List;

public interface PostService {

    void save (Post post);

    void deleteById(long Id);

    Post getById(long Id);


    List<Post>  findAll();

   void update(long Id, Post post);



}
