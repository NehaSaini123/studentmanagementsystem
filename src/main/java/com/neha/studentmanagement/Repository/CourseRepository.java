package com.neha.studentmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neha.studentmanagement.Domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
} 