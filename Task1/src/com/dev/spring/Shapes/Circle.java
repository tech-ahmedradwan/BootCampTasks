package com.dev.spring.Shapes;

import com.dev.spring.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw circle Shape");
    }
}
