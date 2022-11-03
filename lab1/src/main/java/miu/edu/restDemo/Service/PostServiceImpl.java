package miu.edu.restDemo.Service;

import lombok.RequiredArgsConstructor;
import miu.edu.restDemo.Domain.Post;
import miu.edu.restDemo.Domain.dto.PostDto;
import miu.edu.restDemo.Repo.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<PostDto> findAll() {

        var posts =  postRepo.findAll();
                 return posts
                     .stream()
                     .map(post -> modelMapper.map(post,PostDto.class))
                     .collect(Collectors.toList());




    }

    @Override
    public PostDto findById(int id) {

        return modelMapper.map(postRepo.findById(id),PostDto.class);

    }

    @Override
    public void save(PostDto p) {
       postRepo.save(modelMapper.map(p, Post.class));
    }

    @Override
    public void deleteById(int id) {
        postRepo.deleteById(id);

    }

    @Override
    public void update(int id, PostDto p) {
        postRepo.update(id, modelMapper.map(p,Post.class));

    }
}
