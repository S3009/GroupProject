package com.groupproject.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupproject.app.model.Student;
import com.groupproject.app.servicei.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/saveSingleStudent")
	public Student saveStudent(@RequestBody Student s) {
	
		Student stu=ss.saveStudent(s);
		return stu;
		
	}

}
