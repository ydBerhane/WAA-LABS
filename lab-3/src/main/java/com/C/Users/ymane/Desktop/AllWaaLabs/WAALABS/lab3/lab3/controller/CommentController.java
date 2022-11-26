package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.controller;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Comment;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping("/api/v1/comments")
    List<Comment> findAll(){
        return commentService.findAll();

    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping("/{id}")
    Comment getById(@PathVariable Long id){

        return commentService.getById(id);
    }


    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/api/v1/comments")
    void save(@RequestBody Comment comment){

        commentService.save(comment);
    }

   @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id){
        commentService.deleteById(id);

   }

    @PutMapping("/{id}")
    void update(@PathVariable long id, Comment comment){
        commentService.update(id,comment);
    }



}
