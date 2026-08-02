package com.dev.spring.shapes;

import com.dev.spring.Shape;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {



    @Override
    public void getArea(double raduis) {
        System.out.println(3.14*raduis*raduis);
    }
}
