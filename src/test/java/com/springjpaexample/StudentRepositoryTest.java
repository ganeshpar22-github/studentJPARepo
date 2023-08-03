package com.springjpaexample;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springjpaexample.entity.Student;
import com.springjpaexample.repository.StudentRepository;

@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void saveStudent() {

		Student student = new Student();
		student.setName("Ganesh Parmar");
		student.setFatherName("Sunil Parmar");
		student.setAge(25);
		student.setMarks(new BigDecimal(74));
		student.setDescription("Need to work hard");

		Student saveStudent = studentRepository.save(student);

		System.out.println(saveStudent.getId());
		System.out.println(saveStudent.toString());

	}

	@Test
	void updateStudent() {

		Long id = 1L;
		Student student = studentRepository.findById(id).get();

		student.setName("Gunjan Parmar");
		student.setDescription("Average student, needs to work hard in upcoming exams");
		
		studentRepository.save(student);
		
		System.out.println(student.toString());
		System.out.println(student.getDescription() + "for student name " + student.getName());

	}
	
	@Test
	void saveMultipleStudent() {
		
		Student student = new Student();
		student.setName("Gunjan Parmar");
		student.setFatherName("Sunil Parmar");
		student.setAge(25);
		student.setMarks(new BigDecimal(89.45));
		student.setDescription("Good in coding");
		
		
		Student student2 = new Student();
		student2.setName("Aditya Namdev");
		student2.setFatherName("Mr. Namdev");
		student2.setAge(25);
		student2.setMarks(new BigDecimal(95));
		student2.setDescription("Good Improvement");
		
		
		Student student3 = new Student();
		student3.setName("Shalini Parmar");
		student3.setFatherName("Anil Parmar");
		student3.setAge(22);
		student3.setMarks(new BigDecimal(99));
		student3.setDescription("Exceptional and hard working");
		
		
		studentRepository.saveAll(Arrays.asList(student,student2,student3));
		
	}
	
	
	@Test
	void retrieveAllStudent() {
		
		List<Student> students = studentRepository.findAll();
		
		students.forEach((s)->{
			System.out.println("ID : "+ s.getId() + " Name : " + s.getName());
		});
		
	}
	
	
	@Test
	void deletebyId() {
		
		Long id = 2l;
		
		studentRepository.deleteById(id);
		
	}
	
	@Test
	void deleteAllRecords() {
		
		studentRepository.deleteAll();
		
	}
	
	@Test
	void countStudent() {
		
		Long count = studentRepository.count();
		System.out.println(count);
		
	}

}
