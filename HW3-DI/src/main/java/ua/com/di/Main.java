package ua.com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.di.entities.CollectionDocs;
import ua.com.di.entities.Librarians;
import ua.com.di.entities.User;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
        Librarians librarians = (Librarians) context.getBean("librarians");
        System.out.println(librarians.toString());
        CollectionDocs collectionDocs = (CollectionDocs) context.getBean("collection");
        System.out.println(collectionDocs.toString());
    }
}