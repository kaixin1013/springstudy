package com.spring.aop;

/**
 * Created by hp on 2019/3/7.
 */
public class Car implements Move {

    @Override
    public void move() {
        System.out.println("car is moving...");
    }
}
