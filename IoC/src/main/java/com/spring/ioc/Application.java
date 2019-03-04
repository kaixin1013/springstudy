package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hp on 2019/3/4.
 */
public class Application {
    public static  void main (String []arg){
        @SuppressWarnings("resource")

        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Messageprinter printer=context.getBean(Messageprinter.class);
        printer.printMessage();
    }
}
