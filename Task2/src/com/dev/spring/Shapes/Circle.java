package com.dev.spring.Shapes;

import com.dev.spring.Drawing.Draw2D;
import com.dev.spring.Drawing.Draw3D;
import com.dev.spring.Shape;

public class Circle implements Shape {
    private final Draw2D draw2D;
    private final Draw3D draw3D;

    public Circle(Draw2D draw2D,Draw3D draw3D){
        this.draw2D=draw2D;
        this.draw3D=draw3D;
    }


    @Override
    public void draw2d(String shape) {
        draw2D.draw2d(shape);
    }

    @Override
    public void draw3d(String shape) {
        draw3D.draw3d(shape);
    }
}
