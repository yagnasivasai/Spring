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
