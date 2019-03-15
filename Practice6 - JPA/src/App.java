import data.Lecture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import worker.LecturesWorker;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Spring intro");
        lecture.setCredits(2.5);
        LecturesWorker worker = (LecturesWorker) context.getBean("worker");
        worker.addLecture(lecture);
    }
}
