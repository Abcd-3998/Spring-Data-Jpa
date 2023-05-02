package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.enitty.Course;
import com.example.demo.enitty.CourseMaterial;

@SpringBootTest
class CourseRepositoryTest {
	
@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	@Test
	void test() {
		Course course=Course.builder()
				.title("DSA")
				.credit(5)
				.build();
		CourseMaterial courseMaterial=CourseMaterial.builder()
				.url("www.google.com")
				.course(course)
				.build();
		courseMaterialRepository.save(courseMaterial);
		
	}

}
