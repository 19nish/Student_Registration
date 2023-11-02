/*
 * package com.spring.controller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.spring.beans.StudentRegistration;
 * 
 * @Controller
 * 
 * @RestController public class StudentDeleteController {
 * 
 * @DeleteMapping("/delete/student/{regdNum}")
 * 
 * @ResponseBody public String deleteStudentRecord(@PathVariable("regdNum")
 * String regdNum) { System.out.println("In deleteStudentRecord"); return
 * StudentRegistration.getInstance().deleteStudent(regdNum); } }
 */