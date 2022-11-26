package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.repository;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.Post;
import org.hibernate.sql.Select;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

  @Query("SELECT p from Post p where p.title =: title")
  List<Post> getBYTitle(@Param("title") String title);



}
