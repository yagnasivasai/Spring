package org.let.me.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate ID
    private Long id;
    @NotBlank(message="Name cannot be empty")
    private String name;
    @Min(value = 1, message = "Age must be greater than 0")
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

