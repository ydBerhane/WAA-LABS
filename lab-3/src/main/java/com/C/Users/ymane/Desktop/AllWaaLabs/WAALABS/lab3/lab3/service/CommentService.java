package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Comment;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentService {
    void save (Comment comment);

    void deleteById(long Id);


    Comment getById(long Id);


    List<Comment> findAll();

    void update(long Id, Comment comment);


}

