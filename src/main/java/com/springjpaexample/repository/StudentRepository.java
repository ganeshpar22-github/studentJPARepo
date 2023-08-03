package com.springjpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpaexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
