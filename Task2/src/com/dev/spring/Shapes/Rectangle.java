package com.dev.spring.Shapes;

import com.dev.spring.Drawing.Draw2D;
import com.dev.spring.Drawing.Draw3D;
import com.dev.spring.Shape;

public class Rectangle implements Shape {
    private Draw2D draw2D;
    private Draw3D draw3D;

    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
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
