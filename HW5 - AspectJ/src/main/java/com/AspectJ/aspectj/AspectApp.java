package com.AspectJ.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class AspectApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Razer blade = (Razer) applicationContext.getBean("blade");
        System.out.println(blade.getInfo());
        blade.setCondition("Fine");
    }
}
