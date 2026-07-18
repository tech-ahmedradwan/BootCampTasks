package com.dev.spring.shapes;

import com.dev.spring.Shape;
import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

    @Override
    public void getArea(double length) {
        System.out.println(length*length);
    }
}
