package worker;

import data.Student;
import data.dao.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDB(Student student) {
        if ((student != null) && (student.getPib() != null) && (!"".equals(student.getPib())) && (student.getCourse() > 0)) {
            studentsDao.addStudent(student);
            System.out.println("Student added:" + student);
        }
    }
}
