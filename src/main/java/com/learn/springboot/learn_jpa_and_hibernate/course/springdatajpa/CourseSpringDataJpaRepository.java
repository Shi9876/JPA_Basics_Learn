package com.learn.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//extending JPA repository with the entity and the ID.
public interface CourseSpringDataJpaRepository extends JpaRepository <Course, Long> {
     List<Course> findByAuthor(String author);
     List<Course> findByName(String name);
}
