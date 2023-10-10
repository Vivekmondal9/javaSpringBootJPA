package com.vivek.springboot.learnjpaandhibernet.jdbc;

import com.vivek.springboot.learnjpaandhibernet.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseJdbcRepository {


//    private JdbcTemplate springJdbcTemplate;
//
//    public CourseJdbcRepository(JdbcTemplate springJdbcTemplate){
//        this.springJdbcTemplate=springJdbcTemplate;
//    }

    //In the place of create the instance like above
    // We can use @Autowired , it automatically create an instance on that class.
        @Autowired
        private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY= """
            insert into course (id,name,author)
            values(?,?,?)
            
            """;
    private static String DELETE_QUERY= """
            delete from course where id =? 
            """;
    private static String SELECT_QUERY= """
            select * from course; 
            """;


    private static String SELECT_QUERY_BY_ID= """
            select * from course where id = ?
            """;
    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);

    }

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY_BY_ID,new BeanPropertyRowMapper<>(Course.class),id);
    }

    public List<Course> findAll(){
        return springJdbcTemplate.query(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class));
    }



}
