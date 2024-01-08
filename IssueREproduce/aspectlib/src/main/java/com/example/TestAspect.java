package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {
    
    @Before("set(@com.example.TestAspect * *)")
    public void test(JoinPoint jointpoint) {
        System.out.println("Test");
    } 
}
