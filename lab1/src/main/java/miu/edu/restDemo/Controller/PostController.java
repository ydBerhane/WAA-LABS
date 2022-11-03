package miu.edu.restDemo.Controller;


import miu.edu.restDemo.Domain.dto.PostDto;
import miu.edu.restDemo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;

    }



    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostDto> getAll(){
       return postService.findAll();
    }



    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public PostDto getById(@PathVariable("id") int id){
        return postService.findById(id);
    }



    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public void save(@RequestBody PostDto p){
        postService.save(p);
    }




    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") int id){
        postService.deleteById(id);
    }




    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public void update (@PathVariable ("id") int id, @RequestBody PostDto p){
        postService.update(id,p);

    }





}
