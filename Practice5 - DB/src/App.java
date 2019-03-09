import data.Student;
import data.entities.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import worker.WorkWithStudents;
import worker.WorkWithTeacher;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
        Student testStudent = new Student("Valt Vlad", 5);
        worker.saveStudentToDB(testStudent);

        WorkWithTeacher workWithTeacher = (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirsname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTeacher(teacher);
    }
}
