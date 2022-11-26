package com.waa.lab4.Service;

import com.waa.lab4.Domain.Comment;
import com.waa.lab4.Domain.Post;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post findById(long id);
    public void save(Post post);
    public void delete(long id);
    public void update(long id,Post post);
    public void addComment(long id, Comment comment);
    public List<Post> findPostByTitle(String title);
}
