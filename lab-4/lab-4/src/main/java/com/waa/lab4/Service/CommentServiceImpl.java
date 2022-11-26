package com.waa.lab4.Service;

import com.waa.lab4.Domain.Comment;
import com.waa.lab4.Repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public List<Comment> findAll() {
        return  commentRepository.findAll();
    }
    @Override
    public Comment findById(long id) {
        return  commentRepository.findById(id).get();
    }

    @Override
    public void save(Comment com) {
        commentRepository.save(com);
    }



}
