package com.waa.lab2.repository;
import com.waa.lab2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository <User, Long> {




}
