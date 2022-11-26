package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.service;

import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.User;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class UserServiceImpl implements UserService {


    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }

    @Override
    public void deleteById(long Id) {

        userRepository.deleteById(Id);
    }

    @Override
    public Post getById(long Id) {

        return null;
    }


    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
    public void update(Long Id, User user) {
        User user1 = userRepository.findById(Id).orElse(null);
        user1.setName(user.getName());
    }

    @Override
    public List<Post> findPosts(Long id) {
       User user = userRepository.findById(id).orElse(null);
        return user.getPosts();
    }
    public List<User> findUserByPostGreaterThan(@Param("y") int y) {
        var users = userRepository.findAll();
      return  users.stream().filter(x -> x.getPosts().size() > y)
                .collect(Collectors.toList()) ;


    }
}
