package com.groupproject.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.groupproject.app.model.Student;
import com.groupproject.app.servicei.StudentServiceI;

@RestController
public class StudentController
{
	@Autowired
	StudentServiceI ssi;
	@GetMapping("/")
	public String m1()
	{
		return "welcome to student controller";
	}
	@GetMapping("/getStudent/{id}")
	public Student getSingleStudent(@PathVariable int id)
	{
		  Student stu  = ssi.getSingleEmployee(id);
		  return stu;
	}
 
	

}
