package org.let.me.service;


import org.let.me.exception.StudentNotFoundException;
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

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found"));
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentdetails){
        Student student = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
        student.setName(studentdetails.getName());
        student.setAge(studentdetails.getAge());
        return  studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        studentRepository.delete(student);
    }



}
