package cs545.miu.edu.lab8.controller;

import cs545.miu.edu.lab8.domain.Comment;
import cs545.miu.edu.lab8.domain.Post;
import cs545.miu.edu.lab8.domain.User;
import cs545.miu.edu.lab8.service.CommentService;
import cs545.miu.edu.lab8.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@CrossOrigin("*")
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    PostService postService;


    @GetMapping
    public List<Comment> getComments(){
        return commentService.getAll();
    }

    @GetMapping("/{id}")
    public List<Comment> getComments(@PathVariable("id") long id){
        return postService.getPostWithComments(id);
    }

    @PostMapping("/{id}/save")
    public void save( @PathVariable ("id") long id , @RequestBody Comment comment){
        commentService.addComment(id , comment);

    }
    @DeleteMapping("/id")
    public void deletedViaId(@PathVariable long id){
        commentService.deleteCommment(id);
    }


}
