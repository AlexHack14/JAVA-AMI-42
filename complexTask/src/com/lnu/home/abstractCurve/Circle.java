package com.lnu.home.abstractCurve;

public class Circle extends Curve {

    double a, b, r;

    public Circle(double x, double a, double b, double r) {
        super(x);
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public double getY() {
        return Math.sqrt(r * r - Math.pow(x - a, 2)) + b;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                ", r=" + r +
                ", x=" + x +
                ", Y=" + getY() +
                '}';
    }
}
