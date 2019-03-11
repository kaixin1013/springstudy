package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class ImageCopyApp {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
        ImageCopy imageCope=context.getBean(ImageCopy.class);
        try{
            imageCope.copyImage();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}