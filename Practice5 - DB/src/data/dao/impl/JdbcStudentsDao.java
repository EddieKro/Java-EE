package data.dao.impl;

import data.Student;
import data.dao.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcStudentsDao implements StudentsDao {

    private static final String SQL_INSERT_STUDENT = "insert into students(pib,course) values (?,?)";
    private static final String SQL_SELECT_STUDENT_BY_ID = "select id,pib,course from students where id = ?";

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;


    public void addStudent(Student student) {
        jdbcTemplate.update(SQL_INSERT_STUDENT,
                student.getPib(),
                student.getCourse());
    }

    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID,
                new ParameterizedRowMapper<Student>() {
                    @Override
                    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                        Student student = new Student();
                        student.setStudentId(resultSet.getInt(1));
                        student.setPib(resultSet.getString(2));
                        student.setCourse(resultSet.getInt(3));
                        return null;
                    }
                }, id);
    }
}
