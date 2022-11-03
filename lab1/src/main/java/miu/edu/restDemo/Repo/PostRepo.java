package miu.edu.restDemo.Repo;

import miu.edu.restDemo.Domain.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> findAll();

    Post findById(int id);

    void save(Post p);

    void deleteById(int id);

    void update(int id, Post p);

}
