package data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="students")
@NamedQueries({
        @NamedQuery(name = Student.getAllStudents, query = "SELECT student FROM Student student"),
        @NamedQuery(name =Student.getStudentByPib, query = "SELECT student FROM Student student WHERE student.pib = :pib"),
        @NamedQuery(name =Student.getStudentsByCourse, query = "SELECT student FROM Student student WHERE student.course = :course")
})
public class Student implements Serializable {
    public static final String getAllStudents = "Student.getAllStudents";
    public static final String getStudentByPib = "Student.getStudentByPib";
    public static final String getStudentsByCourse = "Student.getStudentsByCourse";
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int studentId;

    private String pib;
    private int course;
//getters, setters, equals, hash


    public int getCourse() {
        return course;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}