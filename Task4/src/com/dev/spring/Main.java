package com.dev.spring;

import com.dev.spring.shapes.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape circle = container.getBean("circle", Shape.class);
        Shape rectangle = container.getBean("rectangle", Shape.class);

        circle.draw2d();
        circle.draw3d();

        rectangle.draw2d();
        rectangle.draw3d();
    }
}
