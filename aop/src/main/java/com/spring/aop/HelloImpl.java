package com.spring.aop;

/**
 * Created by hp on 2019/3/7.
 */
public class HelloImpl implements Hello {


    @Override
    public String hello() {
        return "Hello String AOP";
    }
}
