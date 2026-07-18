package com.dev.spring.Shapes;

import com.dev.spring.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle Shape");
    }
}
