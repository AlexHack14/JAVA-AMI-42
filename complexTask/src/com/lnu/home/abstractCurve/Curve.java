package com.lnu.home.abstractCurve;

public abstract class Curve {

    double x;

    public Curve(double x) {
        this.x = x;
    }

    abstract double getY();
}
