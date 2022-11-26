package com.waa.lab4.Service;

import com.waa.lab4.Domain.Post;
import com.waa.lab4.Domain.User;
import com.waa.lab4.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return  userRepository.findAll();
    }
    @Override
    public User findById(long id) {
        return  userRepository.findById(id).get();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<Post> findPosts(long id) {
        User  user = userRepository.findById(id).get();
        return user.getPosts();

    }
    @Override
    public void addPost(long id, Post post){
        userRepository.findById(id).get().getPosts().add(post);
        userRepository.save(userRepository.findById(id).get());
    }

    @Override
    public List<User> findUserByPostsGreaterThan(int n) {
        var users = userRepository.findAll();
        return users.stream().filter(u -> u.getPosts().size() > n)
                .collect(Collectors.toList());
    }
}
