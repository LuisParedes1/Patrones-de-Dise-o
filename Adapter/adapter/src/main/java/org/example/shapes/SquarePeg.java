package org.example.shapes;

import static java.lang.Math.pow;

public class SquarePeg {
    private double width;

    public SquarePeg(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public double getSquare(){
        return pow(this.getWidth(),2);
    }
}
