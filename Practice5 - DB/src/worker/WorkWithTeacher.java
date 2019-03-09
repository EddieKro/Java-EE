package worker;

import data.dao.TeachersDao;
import data.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithTeacher {
    @Autowired
    private TeachersDao teachersDao;

    public Teacher addTeacher(Teacher teacher) {
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher added" + teacher);
        return teacher;
    }

    public Teacher getTeacherById(int id) {
        return teachersDao.getTeacherById(id);
    }

    public void saveTeacher(Teacher teacher) {
        teachersDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved" + teacher);
    }
}
