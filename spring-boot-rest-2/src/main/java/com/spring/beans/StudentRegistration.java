package com.spring.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

	private List<Student> studentRecords;
	
	  private static StudentRegistration stdregd = null;
	  
	  private StudentRegistration() {
		  studentRecords = new ArrayList<Student>();
	  }
	  
	  public static StudentRegistration getInstance() {
		  if(stdregd == null) {
			  stdregd = new StudentRegistration();
			  return stdregd;
		  }else {
			  return stdregd;
		  }
	  }
	  
	  //Method to add student
	  public void add(Student std) {
		 studentRecords.add(std);
	  }
	  
	  //update student details 
	  public String upDateStudent(Student std) {
		  
		  for(int i=0; i<studentRecords.size(); i++) {
			  Student stdn = studentRecords.get(i);
			  if(stdn.getRegistrationNumber().equals(std.registrationNumber)) {
				  studentRecords.set(i, std); //update the new record 
				  return "Update Successful";
			  }
		  }
		  
		  return "Update un-successful";
	  }
	  
	  //delete student records 
	  public String deleteStudent(String registrationNumber) {
		  for(int i=0; i<studentRecords.size(); i++ ) {
			  Student stdn = studentRecords.get(i);
			  if(stdn.getRegistrationNumber().equals(registrationNumber)) {
				  studentRecords.remove(i); //update the new record
				  return "Delete Successful";
			  }
			  
		  }
		  return "Delete Un-Successful";
	  }
	  
	  
	  //get records
	  public List<Student> getStudentRecords() {
		    return studentRecords;
		    }
}
