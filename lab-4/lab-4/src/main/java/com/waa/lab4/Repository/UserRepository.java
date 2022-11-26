package com.waa.lab4.Repository;

import com.waa.lab4.Domain.Post;
import com.waa.lab4.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u.posts from User u where u.id= :id")
    public List<Post> findUserPosts(@Param("id") long id);
    @Query("select u from User u where u.posts.size > :n")
    public List<User>findUserByPostsGreaterThan(@Param("n")int n);
}
