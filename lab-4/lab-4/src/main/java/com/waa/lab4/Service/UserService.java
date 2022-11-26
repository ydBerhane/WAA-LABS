package com.waa.lab4.Service;

import com.waa.lab4.Domain.Post;
import com.waa.lab4.Domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(long id);
    public void save(User user);
    public List<Post> findPosts(long id);
    public void addPost(long id, Post post);
    public List<User>findUserByPostsGreaterThan(int n);

}
