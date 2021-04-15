package com.lnu.home.abstractCurve;

public class Parabola extends Curve {

    double a, b, c;

    public Parabola(double x, double a, double b, double c) {
        super(x);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getY() {
        return a * x * x + b * x + c;
    }

    @Override
    public String toString() {
        return "Parabola{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x=" + x +
                ", Y=" + getY() +
                '}';
    }
}
