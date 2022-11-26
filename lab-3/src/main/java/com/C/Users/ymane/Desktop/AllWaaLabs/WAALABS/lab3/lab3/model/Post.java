package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue
    Long Id;
    String title;
    String content;
    String author;

    @OneToMany(mappedBy = "post")
    @Cascade(CascadeType.ALL)
    List<Comment> comments;

    @ManyToOne(cascade = javax.persistence.CascadeType.ALL)
    private User user;
}
