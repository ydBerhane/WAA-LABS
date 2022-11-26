package cs545.miu.edu.lab8.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "comments")


public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;






}
