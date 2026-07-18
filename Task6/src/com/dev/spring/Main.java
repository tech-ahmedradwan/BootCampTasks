package com.dev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle = container.getBean("circle", Shape.class);
        Shape square = container.getBean("square", Shape.class);

        circle.getArea(9);
        square.getArea(9);
    }
}
