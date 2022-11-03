package miu.edu.restDemo.Repo;

import miu.edu.restDemo.Domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostRepoImpl implements PostRepo{
    private static List<Post> posts;
    private static int postId;

    static {
        postId = 1;
        posts = new ArrayList<>();
        Post p1 = new Post(1, "gullivers travels","huge creature","david gross");
        Post p2 = new Post(2,"unfuck urself", "everyday pains", "mark manson");
        Post p3 = new Post(3,"the subtle art of not giving a fuck", "keeping it simple", "mark manson");
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post findById(int id) {
        return posts
                .stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Post p) {
      p.setId(postId);
      postId++;
      posts.add(p);

    }
    //        Post p3 = new Post(3,"the subtle art of not giving a fuck", "keeping it simple", "mark manson");

    @Override
    public void deleteById(int id) {
        var post =posts
                .stream()
                .filter(p -> p.getId()==id)
                .findFirst().get();
              posts.remove(post);


    }

    @Override
    public void update(int id, Post p) {
        Post gotPost=findById(id);
        gotPost.setAuthor(p.getAuthor());
        gotPost.setTitle(p.getTitle());


    }
}
