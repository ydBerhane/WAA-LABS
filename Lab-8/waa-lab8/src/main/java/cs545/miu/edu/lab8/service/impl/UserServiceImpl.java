package cs545.miu.edu.lab8.service.impl;


import cs545.miu.edu.lab8.domain.Post;
import cs545.miu.edu.lab8.domain.User;
import cs545.miu.edu.lab8.repository.UserRepo;
import cs545.miu.edu.lab8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
//@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);

    }

    @Override
    public List<Post> getUsersPosts(long id) {
        return userRepo.findById(id).get().getPosts();
    }

    @Override
    public List<User> getUserByPosts(int num) {
       var users = userRepo.findAll();
     return  users.stream().filter(u->u.getPosts().
             size()>num).collect(Collectors.toList());

    }


}
