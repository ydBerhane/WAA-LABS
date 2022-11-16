package com.waa.lab2.service;

import com.waa.lab2.model.Post;
import com.waa.lab2.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public void save(Post post) {
        postRepository.save(post);

    }

    @Override
    public void deleteById(long Id) {
          postRepository.deleteById(Id);
    }

    @Override
    public Post getById(long Id) {
        return postRepository.findById(Id).orElse(null);
    }

    @Override
    public List<Post> findAll() {
        return (List<Post>) postRepository.findAll() ;
    }

    @Override
    public void update(long Id, Post post) {

    }
}
