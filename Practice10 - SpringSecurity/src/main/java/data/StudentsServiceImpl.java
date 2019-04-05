package data;


import data.dao.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsDao studentsDao;

    @Override
    public Student addStudent(Student student) {
        if (student == null)
            return null;
        return studentsDao.addStudent(student);
    }

    @Override
    public Student getStudentById(int studentId) {
        if (studentId == 0)
            return null;
        return studentsDao.getStudentById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentsDao.getAllStudents();
    }

    @Override
    public Student getStudentByPIB(String pib) {
        if ((pib == null) || ("".equals(pib)))
            return null;
        return studentsDao.getStudentByPIB(pib);
    }

    @Override
    public List<Student> getAllStudentsByCourse(int course) {
        if (course == 0)
            return null;
        return studentsDao.getAllStudentsByCourse(course);
    }

    @Override
    public void saveStudent(Student student) {
        if (student == null)
            return;
        studentsDao.saveStudent(student);
    }
}
