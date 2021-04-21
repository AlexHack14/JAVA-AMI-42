package ua.edu.lnu.task.conditionaloperator.squarefigure;

public class Circle extends Figure {
    private final double p = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return p*Math.pow(r, 2);
    }
}
