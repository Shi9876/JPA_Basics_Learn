package com.learn.springboot.learn_jpa_and_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}
