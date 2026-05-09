package com.elhackarz.fehu2026.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Exams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String examName; 
    
    @Column(length = 500) 
    private String driveUrl; 

    @ManyToOne 
    @JoinColumn(name = "subject_id") 
    @JsonIgnore 
    private Subjects subject;

    public Exams() {}

    
    public Long getId() { return id; }
    public String getExamName() { return examName; }
    public void setExamName(String examName) { this.examName = examName; }
    public String getDriveUrl() { return driveUrl; }
    public void setDriveUrl(String driveUrl) { this.driveUrl = driveUrl; }
    public Subjects getSubject() { return subject; }
    public void setSubject(Subjects subject) { this.subject = subject; }
}
