package com.groupproject.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupproject.app.model.Student;
import com.groupproject.app.repository.StudentRepository;
import com.groupproject.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;

	@Override
	public Student updateData(Student so) {
		// TODO Auto-generated method stub
		return sr.save(so);
	}
}
