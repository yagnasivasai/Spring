package org.let.me.service;


import org.let.me.model.Student;
import org.let.me.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    getAllStudents() → Fetches all students from the database.
//    saveStudent() → Saves a new student to the database.

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}
