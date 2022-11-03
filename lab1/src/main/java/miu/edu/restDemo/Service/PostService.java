package miu.edu.restDemo.Service;

import miu.edu.restDemo.Domain.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();

    PostDto findById(int id);

    void save(PostDto p);

    void deleteById(int id);

    void update(int id, PostDto p);

}
