/*
 * package com.spring.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.spring.beans.*;
 * 
 * @Controller
 * 
 * @RestController public class StudentRegistrationController {
 * 
 * @PostMapping("/register/student")
 * 
 * @ResponseBody public StudentRegistrationReply registerStudent(@RequestBody
 * Student student) { System.out.println("In Register Student");
 * 
 * StudentRegistrationReply stdregreply = new StudentRegistrationReply();
 * StudentRegistration.getInstance().add(student); //We are setting the below
 * value just to reply a message back to the caller
 * stdregreply.setName(student.getName()); stdregreply.setAge(student.getAge());
 * stdregreply.setRegistrationNumber(student.getRegistrationNumber());
 * stdregreply.setRegistrationStatus("Successful"); return stdregreply; }
 * 
 * 
 * }
 */