package com.spring.ioc;

/**
 * Created by hp on 2019/3/4.
 */
public class Max {
    private int a;
    private  int b;

    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getMax(){
        return a > b ? a : b;
    }
}
