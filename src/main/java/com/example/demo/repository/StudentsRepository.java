package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.enitty.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
 
	public List<Students>findByFirstName(String firstname);

	
}
