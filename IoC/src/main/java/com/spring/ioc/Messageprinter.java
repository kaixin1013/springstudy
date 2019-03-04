package com.spring.ioc;

/**
 * Created by hp on 2019/3/4.
 */
public class Messageprinter {
    final  private  MessageService service;
    public  Messageprinter(MessageService service){
        this.service=service;

    }
    public  void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
