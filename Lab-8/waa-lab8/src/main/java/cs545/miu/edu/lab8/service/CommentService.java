package cs545.miu.edu.lab8.service;

import cs545.miu.edu.lab8.domain.Comment;

import java.util.List;

public interface CommentService {

    void addComment(long id , Comment comment);
     List<Comment> getAll();

     void deleteCommment(long id);


}
