package com.dev.spring.shapes;

import com.dev.spring.Shape;
import com.dev.spring.drawing.Draw2D;
import com.dev.spring.drawing.Draw3D;

public class Rectangle implements Shape {
    private Draw2D draw2D;
    private Draw3D draw3D;

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    @Override
    public void draw2d( ) {
        draw2D.draw2d("Rectangle");
    }

    @Override
    public void draw3d() {
        draw3D.draw3d("Rectangle");
    }
}
