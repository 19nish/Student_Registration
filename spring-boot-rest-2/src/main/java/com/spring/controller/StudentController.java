package com.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.beans.Student;
import com.spring.beans.StudentRegistration;
import com.spring.beans.StudentRegistrationReply;

@Controller
@RestController
public class StudentController {

	//Student Retrive controller
	@GetMapping("/student/allstudent")
	@ResponseBody
	public  List<Student> getAllStudents(){
		return StudentRegistration.getInstance().getStudentRecords();
	}
	

	//Student Registration Controller
	@PostMapping("/register/student")
	@ResponseBody
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In Register Student");
		
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		//We are setting the below value just to reply a message back to the caller 
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
		stdregreply.setRegistrationNumber(student.getRegistrationNumber());
		stdregreply.setRegistrationStatus("Successful");
		return stdregreply;
	}
	
	
	//Student Update Controller
	@PutMapping("/update/student")
	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");
		return StudentRegistration.getInstance().upDateStudent(stdn);
	}
	
	//Student Records Delete controller
	@DeleteMapping("/delete/student/{regdNum}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
		System.out.println("In deleteStudentRecord");
		return StudentRegistration.getInstance().deleteStudent(regdNum);
	}

}
