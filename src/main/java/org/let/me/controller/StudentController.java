package org.let.me.controller;


import org.let.me.model.Student;
import org.let.me.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();  // Fetch students from DB
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);  // Add student to DB
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully!";
    }

}
