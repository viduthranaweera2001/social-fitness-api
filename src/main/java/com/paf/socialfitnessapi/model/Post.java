package com.paf.socialfitnessapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private List<String> imgUrl;
    private String videoPath;
    private LocalDate postedDate;
    private LocalTime postedTime;
    @ManyToOne
    private User user;
}
