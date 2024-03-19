package com.paf.socialfitnessapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String imageUrl;
    private LocalDate createdDate;
    private LocalTime createdTime;
    @OneToMany(mappedBy = "user")
    private List<Post> postList;
}
