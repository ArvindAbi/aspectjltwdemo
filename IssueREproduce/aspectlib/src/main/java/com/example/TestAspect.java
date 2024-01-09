package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {
    @Before("set(@com.example.TestAnnotation * *)")
    public void test(JoinPoint joinPoint) {
        System.out.println(joinPoint);
    }
}
