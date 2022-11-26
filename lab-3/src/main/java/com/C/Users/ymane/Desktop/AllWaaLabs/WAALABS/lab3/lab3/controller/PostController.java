package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.controller;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service.PostService;
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


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{title}")
    List<Post> findByTitle(@PathVariable String title){

        return postService.findByTitle(title);
    }



}
