package com.groupproject.app.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.groupproject.app.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	Optional<Student> findAllById(int id);

	

}
