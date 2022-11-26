package cs545.miu.edu.lab8.controller;


import cs545.miu.edu.lab8.domain.Post;
import cs545.miu.edu.lab8.domain.User;
import cs545.miu.edu.lab8.service.PostService;
import cs545.miu.edu.lab8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    PostService postService;

    @GetMapping
    public List<User> displayUsers(){
    return    userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User displayById(@PathVariable("id") long id){
        return userService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userService.saveUser(user);
    }
  @GetMapping("/{id}/posts")
    public List<Post> getPostsByUserId(@PathVariable("id") long id){
        return userService.getUsersPosts(id);
  }

  @GetMapping("/filter/posts/{n}")
    public List<User> getByNumOfPosts(@PathVariable("n") int n){
        return userService.getUserByPosts(n);
  }
 @GetMapping("/filter/{title}")
 public List<Post> getAllByTitle(@PathVariable("title") String title){
        return postService.getAllByTitle(title);
 }
}
