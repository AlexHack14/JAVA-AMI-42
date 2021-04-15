package com.lnu.home.abstractCurve;

public class Line extends Curve {

    double a, b;

    public Line(double x, double a, double b) {
        super(x);
        this.a = a;
        this.b = b;
    }

    public double getY() {
        return a * x + b;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                ", x=" + x +
                ", Y=" + getY() +
                '}';
    }
}
