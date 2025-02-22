package org.let.me;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

// Define the Student Entity
// Create the Repository Layer
// Create the Service Layer
// Create the Controller Layer
// Configure the application.properties
// Test the Application

/*
@Entity: Tells Spring that this class should be stored in the database.
@Id: Marks the id field as the primary key.
@GeneratedValue(strategy = GenerationType.IDENTITY): Tells Spring to generate unique IDs automatically for each student.
*/

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID will be generated automatically in the database
    private String name;
    private String email;

    // Constructor to create a Student
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
}

