package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Comment;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {

        this.commentRepository = commentRepository;
    }



    @Override
    public List<Comment> findAll() {

        return commentRepository.findAll();
    }


    @Override
    public Comment getById(long Id) {

        return commentRepository.findById(Id).orElse(null);
    }


    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void deleteById(long Id) {

        commentRepository.deleteById(Id);
    }




    @Override
    public void update(long Id, Comment comment) {
       Comment com = commentRepository.findById(Id).orElse(null);
       com.setName(com.getName());

    }



}
