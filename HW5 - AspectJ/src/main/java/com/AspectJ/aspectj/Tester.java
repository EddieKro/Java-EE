package com.AspectJ.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

@Aspect
public class Tester {
    @Before("execution(public * *Info())")
    public void request() {
        Date date = new Date();
        System.out.println("Request time:" + date.toString());
    }

    @Before("razerMethods()")
    public void razerAdvice() {
        System.out.println("Don't buy MacBook");
    }

    @Pointcut("within(com.AspectJ.aspectj.Razer)")
    public void razerMethods() {
    }


    @Before("mackbookMethods()")
    public void macbookAdvice() {
        System.out.println("Don't buy MacBook. Stay on bright side");
    }

    @Pointcut("within(com.AspectJ.aspectj.MacBook)")
    public void mackbookMethods() {
    }

    @After("execution(public * com.AspectJ.aspectj.Razer.setCondition(..))")
    public void conditionSet(JoinPoint joinPoint) {
        Razer laptop = (Razer) joinPoint.getTarget();
        if (laptop.condition.equals("Fine")) {
            laptop.name = laptop.name.concat(" fine");
        }
        System.out.println("Name changed");
    }
}
