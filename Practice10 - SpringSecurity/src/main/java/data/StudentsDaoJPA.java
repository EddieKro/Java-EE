package data;

import data.dao.StudentsDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentsDaoJPA implements StudentsDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Student addStudent(Student student) {
        em.persist(student);
        return student;
    }

    @Override
    public Student getStudentById(int studentId) {
        return em.find(Student.class, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = null;
        try {
            Query query = em.createNamedQuery(Student.getAllStudents);
        } catch (Exception ex) {
            System.err.println("Error: StudentsDaoJPA" + ex);
        }
        return students;
    }

    @Override
    public Student getStudentByPIB(String pib) {
        Student students = null;
        try {
            Query query = em.createNamedQuery(Student.getStudentByPib);
            query.setParameter("pib", pib);
            students = (Student) query.getSingleResult();
        } catch (Exception ex) {
            System.err.println("Error: StudentsDaoJPA" + ex);
        }
        return null;
    }

    @Override
    public List<Student> getAllStudentsByCourse(int course) {
        List<Student> students = null;
        try {
            Query query = em.createNamedQuery(Student.getStudentsByCourse);
            query.setParameter("course", course);
            students = query.getResultList();
        } catch (Exception ex) {
            System.err.println("Error: StudentsDaoJPA" + ex);
        }
        return null;
    }

    @Override
    public void saveStudent(Student student) {
        em.merge(student);
    }
}
