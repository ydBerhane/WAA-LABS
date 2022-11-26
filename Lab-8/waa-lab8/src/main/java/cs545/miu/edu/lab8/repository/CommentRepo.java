package cs545.miu.edu.lab8.repository;

import cs545.miu.edu.lab8.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {


}
