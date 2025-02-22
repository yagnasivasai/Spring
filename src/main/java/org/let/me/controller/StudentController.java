package org.let.me.controller;


import jakarta.validation.Valid;
import org.let.me.model.Student;
import org.let.me.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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

//    @GetMapping("/{id}")
//    public Student getStudentById(Long id){
//        return studentService.getStudentById(id);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
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

    @PostMapping("/addCheck")
    public ResponseEntity<?> addStudent(@Valid @RequestBody Student student, BindingResult result){
        if (result.hasErrors()){
            List<String> errors = result.getAllErrors().stream().map(error -> error.getDefaultMessage()).toList();
            return ResponseEntity.badRequest().body(errors);
        }

        return ResponseEntity.ok(studentService.saveStudent(student));
    }
    @GetMapping
    public Page<Student> getStudents(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        return studentService.getStudents(page, size);
    }
}
