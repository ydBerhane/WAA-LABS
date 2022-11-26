package cs545.miu.edu.lab8.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "users")
    private List<Post> posts;


}
