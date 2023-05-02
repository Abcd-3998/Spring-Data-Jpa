package com.example.demo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.enitty.Guardian;
import com.example.demo.enitty.Students;

@SpringBootTest
class StudentsRepositoryTest {
	@Autowired
	private StudentsRepository studentsRepository;

	@Test
	public void saveStudents() {
		
		/*
		 * Guardian guardian=Guardian.builder() .email("muruganadham@gamil.com")
		 * .name("muruganandham") .phoneNumber("8888883388") .build();
		 */
		Students students=Students.builder() 
				.email("selvakuamr@gmail.com")
		  .firstName("Selva") 
		  .lastName("kumar") 
		  .guardianEmail("muruganandham@gmail.com")
		  .guardianName("muruganandham")
		  .guardianPhonenuumber("8888888888")
		  
		  .build();
		 
		  //.guardianName("muruganandham")
		// .guardianEmail("muruganadham@gmail.com")
		 //guardianPhonenuumber("9999999999") .build();
		 studentsRepository.save(students);
		 
	}

	@Test
	public void studentsWithGuardian() {

 
		/*
		 * Guardian guardian=Guardian.builder() .email("muruganadham@gamil.com")
		 * .name("muruganandham") .phoneNumber("8888883388") .build(); Students
		 * students=Students.builder() .firstName("vasanth") .lastName("kumar")
		 * .email("vasanth@gmail.com") .guardian(guardian) .build();
		 * 
		 * studentsRepository.save(students);
		 */
	}
	@Test
	public void printStudentsByFirstName()
	{
		List<Students>students = studentsRepository.findByFirstName("vasanth");
		System.out.println("firstName"+students);
	}

}
