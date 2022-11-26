package com.waa.lab4.Service;

import com.waa.lab4.Domain.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> findAll();
    public Comment findById(long id);
    public void save(Comment com);
}
