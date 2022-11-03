package miu.edu.restDemo.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    int id;
    String title;
    String content;
    String author;

}
