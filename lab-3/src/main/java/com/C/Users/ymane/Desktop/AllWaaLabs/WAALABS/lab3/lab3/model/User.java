package com.C.Users.ymane.Desktop.AllWaaLabs.WAALABS.lab3.lab3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public class User {


        @Id
        @GeneratedValue
        Long id;
        String name;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn
        List<Post> posts;
}
