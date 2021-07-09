package com.example.faceflixzonspringbootproject.beans;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private ZonedDateTime createdAt;
    private Address address;
    private Gender gender;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpentInBooks;
    private String email;
}