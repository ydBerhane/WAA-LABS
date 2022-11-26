package cs545.miu.edu.lab8.service.impl;

import cs545.miu.edu.lab8.domain.Comment;
import cs545.miu.edu.lab8.repository.CommentRepo;
import cs545.miu.edu.lab8.repository.UserRepo;
import cs545.miu.edu.lab8.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;
    UserRepo userRepo;



    @Override
    public void addComment(long id, Comment comment) {
       var temp =  userRepo.findById(id).get();
       temp.getPosts().stream().filter(p -> p.getComments().add(comment));
    }

    @Override
    public List<Comment> getAll() {
        return commentRepo.findAll();
    }

    @Override
    public void deleteCommment(long id) {
        commentRepo.deleteById(id);

    }


}
