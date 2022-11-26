package cs545.miu.edu.lab8.service;

import cs545.miu.edu.lab8.domain.Comment;
import cs545.miu.edu.lab8.domain.Post;


import java.util.List;

public interface PostService {
    List<Comment> getPostWithComments(long id);

    public List<Post> getAllByTitle(String title);

    public List<Post> getAll();
    public void deletePost(long id);

    public Post addNewPost( Post post);

    public Post findViaId(long id);

}
