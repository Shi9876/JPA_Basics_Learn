package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc ;


import com.learn.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_Query =
            """
                    Insert into course(id, name, author)
                    values(?,?,?);
                    
                    """;

    private static String DELETE_Query =
            """
                    delete from course
                    where id=?
                    """;

    private static String SELECT_Query =
            """
                    SELECT * FROM COURSE
                    where id = ?
                    """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_Query, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_Query, id);
    }

    public Course findById(long id) {
        //ResultSet -> Bean => Row Mapper =>
        return springJdbcTemplate.queryForObject(SELECT_Query,   //firing the select query using id as a parameter
                new BeanPropertyRowMapper<>(Course.class), id);   //query for a specific object


    }
}