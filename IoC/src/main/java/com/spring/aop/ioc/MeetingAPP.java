package com.spring.aop.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hp on 2019/3/4.
 */
public class MeetingAPP {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context = new ClassPathXmlApplicationContext("work.xml");
        Meeting meeting = context.getBean(Meeting.class);
        System.out.println(meeting);
    }

}
