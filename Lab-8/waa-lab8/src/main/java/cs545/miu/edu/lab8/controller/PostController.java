package cs545.miu.edu.lab8.controller;

import cs545.miu.edu.lab8.domain.Post;
import cs545.miu.edu.lab8.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@CrossOrigin("*")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAllPostes(){
        return postService.getAll();
    }
    @GetMapping("/{id}")
    public Post findViaId(@PathVariable long id){
        return postService.findViaId(id);
    }
    @PostMapping
    public Post saveNew(@RequestBody Post post){
        return postService.addNewPost(post);
    }
    
     @DeleteMapping("/{id}")
    public void deletePostById(@PathVariable("id") long id){
        postService.deletePost(id);

     }

}
