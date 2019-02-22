import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Razer blade = (Razer) applicationContext.getBean("blade");
        System.out.println(blade.getInfo() + "\n");

        MacBook pro = (MacBook) applicationContext.getBean("pro");
        System.out.println(pro.getInfo());


    }


}
