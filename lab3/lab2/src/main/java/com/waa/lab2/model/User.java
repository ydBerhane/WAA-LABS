package com.waa.lab2.model;

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
