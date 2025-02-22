//package org.let.me;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//
//    @GetMapping("/jobs")
//    public String job(){
//        return "hello jobs";
//    }
//
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello, Spring Boot!";
//    }
//
//    @GetMapping("/student")
//    public Student getStudent(@RequestParam String name){
//        Student s1 = new Student(name, name.toLowerCase() + "@example.com");
//        return s1;
//    }
//
//}

//
//import org.let.me.model.Student;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;// GET method to fetch all students
//@GetMapping
//public List<Student> getAllStudents() {
//    return studentRepository.findAll(); // Retrieves all students from the database
//}
//
//// POST method to add a new student
//@PostMapping
//public Student addStudent(@RequestBody Student student) {
//    return studentRepository.save(student); // Saves the student to the database
//}
//
//// GET method to fetch a student by email (custom query)
//@GetMapping("/email")
//public Student getStudentByEmail(@RequestParam String email) {
//    return studentRepository.findByEmail(email); // Fetches student by email
//}

//    private List<Student> students = new ArrayList<>();
//

//    public StudentController() {
//        // Add some students to the list (pre-populated data)
//        students.add(new Student("John", "john@example.com"));
//        students.add(new Student("Jane", "jane@example.com"));
//    }
//
//    // This method returns the list of students
//    @GetMapping("/studentslist")
//    public List<Student> getStudents() {
//        return students;
//    }

//    // Add a new student (POST method)
//    @PostMapping("/studentslist")
//    public Student addStudent(@RequestBody Student student) {
//        students.add(student); // Add the student to the list
//        return student; // Return the added student
//    }
