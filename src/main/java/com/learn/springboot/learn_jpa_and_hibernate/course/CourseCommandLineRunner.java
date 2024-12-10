package com.learn.springboot.learn_jpa_and_hibernate.course;

import com.learn.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.learn.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.learn.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

  //  @Autowired
   //private CourseJdbcRepository repository;

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
          repository.save(new Course(1,"Learn AWS Jpa!", "shivanshi"));
          repository.save(new Course(2,"Learn Azure Jpa!", "vaibhav"));
          repository.save(new Course(3,"Learn Devops Jpa!", "shibbu"));

          repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("shivanshi"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS Jpa!"));
        System.out.println(repository.findByName("Learn Devops Jpa!"));
    }
}
