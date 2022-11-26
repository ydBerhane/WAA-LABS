package com.waa.lab2.service;

import com.waa.lab2.model.Post;
import com.waa.lab2.model.User;
import com.waa.lab2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


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
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void update(long Id, User user) {

    }


    @Override
    public List<Post> findPosts(long id) {
        User user = userRepository.findById(id).orElse(null);
        return user.getPosts();
    }


}
