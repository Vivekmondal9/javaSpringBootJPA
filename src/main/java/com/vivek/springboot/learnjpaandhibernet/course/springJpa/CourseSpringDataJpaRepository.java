package com.vivek.springboot.learnjpaandhibernet.course.springJpa;

import com.vivek.springboot.learnjpaandhibernet.course.Course;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByauthor(String author);
    List<Course> findByname(String name);
}
