package com.groupproject.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupproject.app.model.Student;
import com.groupproject.app.repositary.StudentRepo;
import com.groupproject.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	StudentRepo sr;
	@Override
	public Student getSingleEmployee(int id) {
		Optional<Student> op = sr.findAllById(id);
		 
		 if(op.isPresent())
		 {
			 Student student = op.get();
			 return student;
		 }else
		 {
			 return null;
		 }

	}

}
