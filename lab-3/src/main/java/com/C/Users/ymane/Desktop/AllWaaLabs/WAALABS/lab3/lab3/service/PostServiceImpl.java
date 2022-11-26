package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return  postRepository.findAll() ;
    }



    @Override
    public void update(long Id, Post post) {
         Post p = postRepository.findById(Id).orElse(null);

        assert p != null;
        p.setAuthor(p.getAuthor());
         p.setTitle(p.getTitle());



    }

    @Override
    public List<Post> findByTitle(String title) {
        var post = postRepository.findAll();
        return post.stream().filter(p->p.getTitle().equals(title))
                .collect(Collectors.toList());
    }
}
