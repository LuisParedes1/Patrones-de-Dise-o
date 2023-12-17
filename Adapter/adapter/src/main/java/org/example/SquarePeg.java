package org.example;

import static java.lang.Math.pow;

public class SquarePeg {
    private double width;

    SquarePeg(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public double getSquare(){
        return pow(this.width,2);
    }
}
