package com.elhackarz.fehu2026.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Data
@Entity
public class Exams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String examName; 
    
    @Column(length = 500, unique = true) 
    private String driveUrl; 

    private String subject;

    public Exams() {}

}
