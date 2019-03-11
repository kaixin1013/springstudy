package com.spring.aop;
 import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
    @Aspect
    public class Fighter {
        @Pointcut("execution(* com.spring.aop.Tiger.walk())")
        public void fountTiger(){

        }
        @Before(value = "fountTiger()")
        public void foundBefor(){
            System.out.println("Fighter wait for  tiger...");
        }
        @AfterReturning("fountTiger()")
        public void fondAfter(){
            System.out.println("Fighter fight with tiger..");
        }
    }

