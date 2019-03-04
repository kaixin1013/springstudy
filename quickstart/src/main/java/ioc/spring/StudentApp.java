package com.spring.ioc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("/beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}