package org.let.me.controller;


import org.let.me.model.Student;
import org.let.me.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/* @Autowired: This is used to inject the StudentRepository into the controller.
   studentRepository.save(student): This saves the student object to the database.
   studentRepository.findAll(): This retrieves all students stored in the database.

*/


@RestController
@RequestMapping("/students")
public class StudentController {

    // Autowire the StudentRepository to interact with the database
    @Autowired
    private StudentRepository studentRepository;

    // GET method to fetch all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll(); // Retrieves all students from the database
    }

    // POST method to add a new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student); // Saves the student to the database
    }

    // GET method to fetch a student by email (custom query)
    @GetMapping("/email")
    public Student getStudentByEmail(@RequestParam String email) {
        return studentRepository.findByEmail(email); // Fetches student by email
    }

    private List<Student> students = new ArrayList<>();


    public StudentController() {
        // Add some students to the list (pre-populated data)
        students.add(new Student("John", "john@example.com"));
        students.add(new Student("Jane", "jane@example.com"));
    }

    // This method returns the list of students
    @GetMapping("/studentslist")
    public List<Student> getStudents() {
        return students;
    }

//    // Add a new student (POST method)
//    @PostMapping("/studentslist")
//    public Student addStudent(@RequestBody Student student) {
//        students.add(student); // Add the student to the list
//        return student; // Return the added student
//    }
}
