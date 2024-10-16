package com.aslam.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY  =
            """
                    INSERT INTO COURSE (id, name, author)\s
                    VALUES (111, 'AWS', 'ASLAM');        
            """;

    private static final String INSERT_QUERY_TYPE2  =
            """
                    INSERT INTO COURSE (id, name, author)\s
                    VALUES (?, ?, ?);        
            """;

    private static final String DELETE_BY_ID  =
            """
                    DELETE FROM COURSE WHERE ID=?       
            """;

    private static final String SELECT_BY_ID  =
            """
                    SELECT * FROM COURSE WHERE ID=?       
            """;
    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY_TYPE2,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_BY_ID,id);
    }

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(SELECT_BY_ID,
                new BeanPropertyRowMapper<>(Course.class),id);
    }
}
