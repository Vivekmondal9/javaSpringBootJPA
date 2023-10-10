package com.vivek.springboot.learnjpaandhibernet.jdbc;

import com.vivek.springboot.learnjpaandhibernet.course.Course;
import com.vivek.springboot.learnjpaandhibernet.course.jpa.CourseJpaRepository;
import com.vivek.springboot.learnjpaandhibernet.course.springJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
//    private CourseJpaRepository repository;
//    private CourseJdbcRepository repository;
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn JavaScript","Vivek Mondal"));
//        repository.insert(new Course(2,"Learn ReactJs","Coding Invaders"));
//        repository.insert(new Course(3,"Learn AWS","Udemy"));
//        repository.insert(new Course(4,"Learn Hadoop","IBM"));
//        repository.insert(new Course(5,"Learn HTML","Vivek Mondal"));
//
//        repository.deleteById(4);
//
//        System.out.println(repository.findById(1));
//        System.out.println(repository.findById(2));

        repository.save(new Course(1,"Learn JavaScript","Vivek Mondal"));
        repository.save(new Course(2,"Learn ReactJs","Coding Invaders"));
        repository.save(new Course(3,"Learn AWS","Udemy"));
        repository.save(new Course(4,"Learn Hadoop","IBM"));
        repository.save(new Course(5,"Learn HTML","Vivek Mondal"));

        repository.deleteById(4l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findAll());
        System.out.println(repository.findByauthor("Vivek Mondal"));
        System.out.println(repository.findByauthor("Udemy"));
        System.out.println(repository.findByname("Learn AWS"));




        System.out.println("-----------------------");
//        System.out.println(repository.findAll());

    }
}
