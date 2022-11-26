package com.waa.lab2.controller;

import com.waa.lab2.model.Post;
import com.waa.lab2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@ResponseStatus(HttpStatus.OK)
@RequestMapping("/api/v1/posts")
public class PostController {

    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }




    @ResponseStatus
    @GetMapping
    List<Post> findAllPosts(){
        return postService.findAll();
    }





    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    Post findPostById(@PathVariable ("id") long id){
       return postService.getById(id);
    }






    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    void save(@RequestBody Post post){
        postService.save(post);

    }



    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}/")
    void deletebyId(long id){
        postService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{Id}")
    void update(long id, Post post ){

    }




}
