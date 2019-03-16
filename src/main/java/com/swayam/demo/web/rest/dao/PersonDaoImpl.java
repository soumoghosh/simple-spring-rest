package com.swayam.demo.web.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.swayam.demo.web.rest.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

    private final JdbcTemplate jdbctemplate;

    @Autowired
    public PersonDaoImpl(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }

    @Override
    public List<Person> getPersons() {

        String sql = "select * from person ";
        return jdbctemplate.query(sql, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

                Person person = new Person();
                person.setId(rs.getInt("id"));
                person.setFirstname("first_name");
                person.setLastname("last_name");

                return person;
            }
        });
    }

    @Override
    public boolean savePerson(Person person) {
        String insert = "insert into person (first_name,last_name) values(?,?)";
        int row = jdbctemplate.update(insert, person.getFirstname(), person.getLastname());

        return (row == 1);
        /*
         * if (row == 1) return true; else return false;
         */
    }

}
