package com.aslam.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert();
        courseJdbcRepository.insert(new Course(1,"Learn AWS","Aslam"));
        courseJdbcRepository.insert(new Course(2,"Learn AZURE","Aslam"));
        courseJdbcRepository.insert(new Course(3,"Learn Devops","Aslam"));
        courseJdbcRepository.deleteById(111);

        System.out.println(courseJdbcRepository.findById(3));
    }
}
