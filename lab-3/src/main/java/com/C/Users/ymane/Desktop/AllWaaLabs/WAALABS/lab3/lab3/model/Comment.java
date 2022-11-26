package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    long id;
    String name;
    @ManyToOne(cascade = CascadeType.ALL)
    Post post;
}
