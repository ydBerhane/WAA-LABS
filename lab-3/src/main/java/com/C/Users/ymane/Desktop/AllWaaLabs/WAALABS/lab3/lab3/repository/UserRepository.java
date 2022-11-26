package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.repository;
import com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

@Query("select u from User u where u.posts.size> :y")
    List<User> findUserByPostGreaterThan(@Param("y") int y);


}
