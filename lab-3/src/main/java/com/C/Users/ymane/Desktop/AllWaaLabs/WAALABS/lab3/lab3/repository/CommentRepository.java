package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.repository;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
